

class Notification {
public void send(String message) {
System.out.println("General Alert: " + message);
logToSystem(message); 
}
protected void send(String message, String email) {
System.out.println("Email sent to " + email + ": " + message);
}
void send(String message, long phoneNumber) {
System.out.println("SMS sent to " + phoneNumber + ": " + message);
}
private void logToSystem(String message) {
System.out.println("Internal System Log: Notification archived.");}
}

class AppNotification extends Notification {
void displayFeatures() {
System.out.println("App is opened.");
}
}

public class Overloading {
public static void main(String[] args) {
AppNotification myApp = new AppNotification();
myApp.send("System Update available."); 
myApp.send("Welcome!", "xyz@abc.com"); 
myApp.send("Your OTP is 1234", 9876543210L); 
// myApp.logToSystem("Test"); 
}
}


