import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        //user will input a string
        System.out.print("Enter to reverse: ");
        String string = userin.nextLine();

        //declare a new variable for reverse
        StringBuilder string1 = new StringBuilder();

        //make first string into an array
        char[] stringArray = string.toCharArray();

        //get the len of array -1 for the exact length
        int len = stringArray.length-1;

        for(int i = len;i >=0;i--){

            //for each num string 1 will get the last index of the array
            string1.append(stringArray[i]);
            System.out.print(stringArray[i]);

        }
        System.out.println(" ");
        System.out.println(string1);
        String newString = String.valueOf(string1);
        System.out.println(newString);
    }
}