import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pass = req.getParameter("pass");

        PrintWriter out = resp.getWriter();
        if(Users.checkforExistingUser(username)) {
            int poz = Users.getUnames().indexOf(username);
            if(Users.getPasswords().get(poz).equals(pass)) {
                HttpSession session = req.getSession();
                session.setAttribute("user",username);
                resp.sendRedirect("welcome.jsp");
            } else {
                resp.sendRedirect("Login.jsp");
                int counter = Users.getCounter();
                counter++;
                Users.setCounter(counter);
                if(Users.getCounter() == 3)
                    out.println("Too many login attempts");
            }
        }
    }
}
