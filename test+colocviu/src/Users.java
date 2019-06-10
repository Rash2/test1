import java.util.ArrayList;

public class Users {
    private static ArrayList<String> unames = new ArrayList<>();
    private static ArrayList<String> passwords = new ArrayList<>();
    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Users.counter = counter;
    }


    public static ArrayList<String> getUnames() {
        return unames;
    }

    public static void setUnames(ArrayList<String> unames) {
        Users.unames = unames;
    }

    public static ArrayList<String> getPasswords() {
        return passwords;
    }

    public static void setPasswords(ArrayList<String> passwords) {
        Users.passwords = passwords;
    }

    public static void addUname(String uname) {
        unames.add(uname);
    }

   public static void addPassword(String pass) {
        passwords.add(pass);
    }


    public static boolean checkforExistingUser(String username) {
         for(String user:unames) {
             if(user.equals(username)) return true;
         }
        return false;
    }

}
