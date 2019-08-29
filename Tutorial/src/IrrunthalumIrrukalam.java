import java.util.Scanner;

public class IrrunthalumIrrukalam {
   /* public static void main(String[] args) {
        System.out.println("Praba ");

    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empValue = sc.nextInt();
        // int empId = 200;
        int value = 100;
        String name = "sathya";
        int i;
        for (i = value; 200 >= i; i++) {
            if (empValue == value) {
                System.out.println("Employee name :" + name);
            } else if (empValue <= value) {

                System.out.println("No user entered");

            } else {
                System.out.println("Invalid user");
            }
        }
    }}

