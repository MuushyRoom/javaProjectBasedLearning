
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int funcNum,saveNum = 2;

    String userTextInput = "";
    String userSaveInput = "";

   Scanner userFunc = new Scanner(System.in);
   Scanner userSaveNum = new Scanner(System.in);
   Scanner userString = new Scanner(System.in);



  do{

      System.out.println(" ");


      //show menu functions and ask the user for function num
      showMenu();
      funcNum = userFunc.nextInt();


      // if function is not 0/ 0 meaning exit code
      // if saveNum = 1 it will save its last inputted text
      if(funcNum > 0 && saveNum == 1 ){
          System.out.println("saved input = "+userSaveInput);
    userTextInput = userSaveInput;
          System.out.println("SWITCH CASE before="+userTextInput);
          System.out.println("--------------------------------------------");
          System.out.println(" ");
          switch (funcNum){
              case 1:
                  userSaveInput = getUpperCase(userTextInput);


                  break;
              case 2:
                  userSaveInput = getLowerCase(userTextInput);
                  break;
              case 3:
                  userSaveInput = getReverse(userTextInput);

                  break;
              case 5:
                  userSaveInput = checkString(userTextInput);

                  break;


          }
          System.out.print(userSaveInput);
          System.out.println(" ");
          System.out.println("SWITCH CASE  afteer="+userTextInput);
          System.out.println("SWITCH CASE  afteer="+userSaveInput);
          System.out.println(" ");
          System.out.println("--------------------------------------------");


      }else if(funcNum > 0 && funcNum <=5 && saveNum == 2 ){


          System.out.println("Enter string");
          System.out.print("-->");
          userTextInput = userString.nextLine();

          System.out.println("SWITCH CASE before="+userTextInput);
          System.out.println("--------------------------------------------");
          System.out.println(" ");
          switch (funcNum){
              case 1:
                  userSaveInput = getUpperCase(userTextInput);


                  break;
              case 2:
                  userSaveInput = getLowerCase(userTextInput);
                  break;
              case 3:
                  userSaveInput = getReverse(userTextInput);

                  break;
              case 5:
                  userSaveInput = checkString(userTextInput);

                  break;


          }

          System.out.print(userSaveInput);
          System.out.println(" ");
          System.out.println("SWITCH CASE  afteer="+userTextInput);
          System.out.println("SWITCH CASE  afteer="+userSaveInput);
          System.out.println(" ");
          System.out.println("--------------------------------------------");

      }else{
          System.out.println(" ");
          System.out.println("Exiting Program...");
          funcNum = 0;
      }
      System.out.println("do funcnum value = "+funcNum);

      if(funcNum !=0){
          stringSave();
          saveNum = userSaveNum.nextInt();
      }
      // ask the user if they want to save their last inputted string


      if(saveNum == 1){

          System.out.println("saved value = "+userSaveInput);
      }else{

          userSaveInput = "";
      }

  }while(funcNum != 0);

    }



    public static String getUpperCase(String userTextInput){


        System.out.println("Your selected String Function [toUpperCase]");
        System.out.println("Your input = "+userTextInput);
        System.out.print("results = ");

return  userTextInput.toUpperCase();
    }

    public static String getLowerCase(String userTextInput){


        System.out.println("Your selected String Function [toLowerCase]");
        System.out.println("Your input = "+userTextInput);
        System.out.print("results = ");

        return userTextInput.toLowerCase();
    }

    public static String getReverse(String userTextInput){


        System.out.println("Your selected String Function [toReverse]");
        System.out.println("Your input = "+userTextInput);
        System.out.print("results = ");
        //declare a new variable for reverse
        StringBuilder string1 = new StringBuilder();

        //make first string into an array
        char[] stringArray = userTextInput.toCharArray();

        //get the len of array -1 for the exact length
        int len = stringArray.length-1;

        for(int i = len;i >=0;i--){

            //for each num string 1 will get the last index of the array
            string1.append(stringArray[i]);

        }
        userTextInput = String.valueOf(string1);

        return  userTextInput;
    }
    public static String checkString(String userTextInput){

        System.out.println("Your selected String Function [CheckString]");
        System.out.println("Your input = "+userTextInput);
        System.out.print("results = ");
        return userTextInput;
    }
    public static void showMenu(){
        System.out.println(" ");
        System.out.println("Choose a String Function");
        System.out.println("0.Exit Program");
        System.out.println("1.Convert to Upper Case");
        System.out.println("2.Convert to Lower Case");
        System.out.println("3.Reverse String");
        System.out.println("4.Trim Whitespace");
        System.out.println("5.Check String");
        System.out.print("---> ");
    }

    public static void stringSave(){
        System.out.println(" ");
        System.out.println("Would you like your last inputted string?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.print("---> ");
    }

}