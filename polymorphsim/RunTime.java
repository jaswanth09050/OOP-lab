
class calculator {
public int add(int a, int b) {
return a+b;
}
protected void display() {
System.out.println("Two integers have been added.");
}
private void show() {
System.out.println("This is Calculator.");
}
public void accessPrivate() {
show();
}
}

class Advanced extends calculator {
@Override
public int add(int a, int b) {
return a+b+10;
} 
@Override
protected void display() {
System.out.println("The sum of two integers has been incremented by 10.");
}
public void show() {
System.out.println("This is Advanced Calculator.");
}
}

public class RunTime {
public static void main(String[] args) {
calculator calc = new calculator();
Advanced adv = new Advanced();

System.out.println("The sum of 5 and 15 is " + calc.add(5, 15));
calc.display();
calc.accessPrivate();

System.out.println("The sum of 5 and 15 when incremented by 10 is " + adv.add(5, 15));
adv.display();
adv.show();
}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        