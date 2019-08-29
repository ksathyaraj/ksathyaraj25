public class StudentDataBase extends JavaClass {
    public void student1() {
        System.out.println("Name : Sathya");
    }

    public void student2() {
        System.out.println("Name : Raghu");
    }

    public static void main(String[] args) {
        StudentDataBase sdb = new StudentDataBase();
        sdb.student1();
        sdb.student2();
        sdb.methodName1();

    }
}

