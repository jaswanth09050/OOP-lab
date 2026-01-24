public class Public {
public String collegeName = "Amrita School of Engneering";
public void displayCollege() {
System.out.println("College Name: " + collegeName);
}
public static void main(String[] args) {
Public obj = new Public();
obj.displayCollege();
}
}
