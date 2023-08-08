package SOLID_principles;

public class DependencyInversionPrinciple {
}


// higher level modules should not depend on lower level modules. Instead, they both should depend on abstraction.

interface Notifier {
    void sendNotification(String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        // Logic to send notification via email
    }
}

class SMSNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        // Logic to send notification via SMS
    }
}


