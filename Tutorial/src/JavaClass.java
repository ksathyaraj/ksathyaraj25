import static java.lang.System.*;

public class JavaClass {
    public void methodName1() {
        out.println(" First method1");
    }
    public void methodName2(){
        out.println("method2");
    }

    public static void main(String[] args) {
        JavaClass J = new JavaClass();
        J.methodName1();
        JavaClass j = new JavaClass();
        j.methodName2();
        JavaClass method = new JavaClass();
        method.methodName2();method.methodName1();

    }
}
