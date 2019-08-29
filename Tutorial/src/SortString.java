import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    private static String sortString(String s)
    {
        // convert input string to char array
        char[] sort = s.toCharArray();

        // sort tempArray
        Arrays.sort(sort);

        // return new sorted string
        return new String(sort);
    }

    // Driver method
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String stringcontent = in. nextLine();
        System.out. println("Input String" + stringcontent);
        String outputString = sortString(stringcontent);
        System.out.println("Output String : " + outputString);
    }
}
