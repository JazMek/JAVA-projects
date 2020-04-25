import java.util.Scanner;

public class loginInput {

    //	in this homme work I will be creating an app for the Computer the app will performe this defrent tascks
//	1-)collect the information we are going to get from the user
//  2-)compare the username if it is matching if it is matching it will ask to entre the passe word else it will print an error message
//  3-)compare the passe word lok if it match the paase word if it match it will pint "welcome Username" if it dos not mutch it will print a error message
    static String corectUsername;
    static String corectpassWord;
    String userName;
    static String passWord;


    static Scanner input = new Scanner(System.in);


    //      We create a method
    public static void userIdentif() {

        corectUsername = "KRimmek";
        corectpassWord = "2020ab";
        String userName = input.nextLine().toUpperCase();
//	I am using toUpperCase() method to make all to uppercase
        if (userName.equalsIgnoreCase(corectUsername))
//	I am Using String.equalsIgnoreCase() : The String.equalsIgnoreCase() method compares two strings irrespective of the case (lower or upper) of the string.
//		This method returns true if the argument is not null and the contents of both the Strings are same ignoring case, else false.Syntax:
//      str2.equalsIgnoreCase(str1);

        {
            System.out.print("Please entre your Password  " + corectUsername + ":");
               String passWord =input.nextLine();
            if (passWord.equalsIgnoreCase(corectpassWord)) {
                System.out.println("Welcome " + corectUsername);
            } else {
                System.out.println("You entred a rang Password, please try again");
            }

        }


    }


    public static void main(String[] args) {
        System.out.print("Welcome please entre your Username :");
        userIdentif();
    }
}

