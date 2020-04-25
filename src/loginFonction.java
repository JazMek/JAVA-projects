import java.io.File;
import java.util.Scanner;


public class loginFonction {

//    private static Scanner x;
      public static Scanner x;




       public static void main (String[]args){

         String userName="Karim Mekdoud";

           String passWord="karim2020";
           String filePath="/Users/karimmekdoud/Desktop/20315NY_Karim/database01.txt";

           userNmeverif(userName,passWord,filePath );
      }

      public static void userNmeverif(String userName,String passWord ,String filePath)
      {
        boolean found= false;
        String  dataUserName= "";
        String  dataPassWord= "";



          try {
                 x=new Scanner (new File(filePath));
                 x.useDelimiter("[,\n]");
              while(x.hasNext() && !found)
              {
                  dataUserName=x.next();
                  dataPassWord=x.next();



                  if (dataUserName.trim().equals(userName.trim()) && dataPassWord.trim().equals(passWord.trim()))
                { found=true; System.out.println("welcome : "+ userName);}

                  else{System.out.println("Error please try again : "+ userName);}
              }

              x.close();
            System.out.println(found);



         }
          catch (Exception e)
          {
              System.out.println("Error");
          }




      }
}
