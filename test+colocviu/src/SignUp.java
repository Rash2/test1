import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SignUp extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("username");
        String pass = req.getParameter("pass");
        String ip = req.getRemoteAddr();


        PrintWriter out = resp.getWriter();
       if(!Users.checkforExistingUser(uname)) {
            Users.addUname(uname);
            Users.addPassword(pass);
            resp.sendRedirect("Login.jsp");
       } else {
            out.println("User already exists<br>");
            resp.sendRedirect("index.jsp");
        }

    }
}
