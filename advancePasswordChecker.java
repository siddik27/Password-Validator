package strings;
import javax.swing.text.StyledEditorKit;
import java.util.Scanner;
public class advancePasswordChecker {
    public static void main(String[] args) {
        //What it does: Takes a password as input and checks:
        //Length (min 8 chars)
        //At least one uppercase, one lowercase, one digit, one special char

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        //length checking
        boolean isValid = true;
        if (password.length()<8){
            isValid = false;
            System.out.println("Password must contains 8 characters");
        }

        boolean hasUppercasse = false;
        boolean haslowercase = false;
        boolean hasDigits = false;
        boolean hasSpecialcharr = false;

        String specialChar = "!@#$%^&*()_+-={}[]:;\"'<>,.?/\\|~`";
         for (int i=0; i<password.length(); i++){
             if (Character.isLowerCase(password.charAt(i))) haslowercase = true;
             else if (Character.isUpperCase(password.charAt(i))) hasUppercasse = true;
             else if (Character.isDigit(password.charAt(i)))  hasDigits = true;
             else if (specialChar.contains(String.valueOf(password.charAt(i)))) hasSpecialcharr=true;

        }

         if (haslowercase!=true){
             System.out.println("Must contain one Lowercase letter ");
             isValid = false;
         }
        if (hasUppercasse!=true){
            System.out.println("Must contain one Uppercase letter ");
            isValid = false;
        }
        if (hasDigits!=true){
            System.out.println("Must contain one digit  ");
            isValid = false;
        }
        if (hasSpecialcharr!=true){
            System.out.println("Must contain one Special character  ");
            isValid = false;
        }

        if (isValid==true){
            System.out.println("\"✅ Password is valid.\"");
        }
        else System.out.println("❌ Invalid Password!");
   }
}
