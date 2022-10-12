import java.util.Scanner;
public class MainRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String userInput = scan.nextLine();
        int inputLength = userInput.length();
        System.out.println("String length: " + inputLength);

        String firstHalf = userInput.substring(0, inputLength/2);
        String secondHalf = userInput.substring(inputLength/2);

        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);

        System.out.print("Enter second string: ");
        String userInput2 = scan.nextLine();

        if (userInput2.length()>userInput.length()){
            System.out.println(userInput2 + " is longer");
        }
        else if(userInput.length()>userInput2.length()){
            System.out.println(userInput + " is longer");
        }
        else{
            System.out.println("Your two strings have the same length");
        }

        if (userInput.equals(userInput2)){
            System.out.println("The two strings are the same sequence of characters");
        }
        else{
            if (userInput.compareTo(userInput2) < 0){
                System.out.println(userInput + " is first alphabetically");
            }
            else{
                System.out.println(userInput2 + " is first alphabetically");
            }
        }
        if(userInput.indexOf(userInput2) == -1){
            System.out.println(userInput2 + " is NOT found in " + userInput);
        }
        else{
            System.out.println(userInput2 + " is found in " + userInput + " at index " + userInput.indexOf(userInput2));
        }
    }
}
