

class calculator {
public int add(int a, int b) {
return a+b;
}
protected int add(int a, int b, int c) {
return a+b+c;
}
private double add(double a, double b) {
return a+b;
}
public double result(double a, double b) {
double sum = add(a,b);
return sum;
}
}

public class CompileTime {
public static void main(String[] args) {
calculator obj = new calculator ();
System.out.println("The sum of 5 and 10 is " + obj.add(5, 10));
System.out.println("The sum of 5, 10 and 15 is " + obj.add(5, 10, 15));
System.out.println("The sum of 5.10 and 10.5 is " + obj.result(5.10, 10.5));
}
}