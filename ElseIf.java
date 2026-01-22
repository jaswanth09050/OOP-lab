import java.util.*;
class ElseIf {
    public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("Enter marks");
int marks=x.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
