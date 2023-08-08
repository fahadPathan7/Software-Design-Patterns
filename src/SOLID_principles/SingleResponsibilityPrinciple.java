package SOLID_principles;

// should have only one purpose
public class SingleResponsibilityPrinciple {
    String userName = "fahad";
    String pass = "123";

    // only purpose
    boolean verify(String userName, String pass) {
        if (this.userName.equals(userName) && this.pass.equals(pass)) {
            return true;
        }
        else return false;
    }
}
