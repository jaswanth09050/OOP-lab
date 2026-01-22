import java.util.*;
class DoWhileLoop {
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("Enter the number");
int num= x.nextInt();
System.out.println("numbers in series");
int i = 1;
do {
System.out.println(i);
i++;
} while (i <= num);
}
}
