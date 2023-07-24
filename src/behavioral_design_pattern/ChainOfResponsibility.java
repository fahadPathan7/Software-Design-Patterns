package behavioral_design_pattern;

public class ChainOfResponsibility {
}

interface Authenticate {
    void setNextHandler(Authenticate authenticate);
    boolean auth(String name, String pass, String email);
}

class NameAuth implements Authenticate {
    Authenticate authenticate;

    @Override
    public void setNextHandler(Authenticate authenticate) {
        this.authenticate = authenticate;
    }

    @Override
    public boolean auth(String name, String pass, String email) {
        if (name.equals(getName())) {
            System.out.println("Name authentication successful.");
            if (authenticate != null) return authenticate.auth(name, pass, email);
            else return true;
        }
        else {
            System.out.println("Name authentication failed!");
            return false;
        }
    }

    String getName() {
        return "Fahad";
    }
}

class PassAuth implements Authenticate {
    Authenticate authenticate;

    @Override
    public void setNextHandler(Authenticate authenticate) {
        this.authenticate = authenticate;
    }

    @Override
    public boolean auth(String name, String pass, String email) {
        if (pass.equals(getPass())) {
            System.out.println("Pass authentication successful.");
            if (authenticate != null) return authenticate.auth(name, pass, email);
            else return true;
        }
        else {
            System.out.println("Pass authentication failed");
            return false;
        }
    }

    String getPass() {
        return "123";
    }
}

class EmailAuth implements Authenticate {
    Authenticate authenticate;

    @Override
    public void setNextHandler(Authenticate authenticate) {
        this.authenticate = authenticate;
    }

    @Override
    public boolean auth(String name, String pass, String email) {
        if (email.equals(getEmail())) {
            System.out.println("Email authentication successful.");
            if (authenticate != null) return authenticate.auth(name, pass, email);
            else return true;
        }
        else {
            System.out.println("Email authentication failed");
            return false;
        }
    }

    String getEmail() {
        return "fahad@gmail.com";
    }
}

class Main6 {
    public static void main(String[] args) {
        EmailAuth emailAuth = new EmailAuth();
        PassAuth passAuth = new PassAuth();
        NameAuth nameAuth = new NameAuth();

        nameAuth.setNextHandler(passAuth);
        passAuth.setNextHandler(emailAuth);

        boolean auth = nameAuth.auth("Fahad", "123", "fahad@gmail.com");
        if (auth) System.out.println("successful");
        else System.out.println("failed");
    }
}


