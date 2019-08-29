public class MainClassEx {

    public static void main (String[] args){
       ConsExam ce = new ConsExam("Sathya");
       String name1 = ce.call();
       System.out.println(name1);
        ConsExam ce1 = new ConsExam("Raghu");
        String name2 = ce1.call();
        System.out.println(name2);
    }

}
