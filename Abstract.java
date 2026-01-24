public class Abstract {
abstract void show();   // no body
}
class Demo extends Abstract {
void show() {
System.out.println("This is abstract method implementation");
}
public static void main(String[] args) {
Demo obj = new Demo();
obj.show();
}
}
