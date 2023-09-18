
package loginsystem;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;



class login_display{
public static void displayChoices(String username){
    
    System.out.println("\t \t \t -----WELCOME " + username +"----- \t \t \t");
    System.out.println("HOME<< MENU: ");
    System.out.println();
    System.out.println("<1> Search Odd Numbers");
    System.out.println("<2> Search Even Numbers");
    System.out.println("<3> Swap Odd numbers and Even numbers");
    System.out.println("<4> Search Largesr numbers");
    System.out.println("<5> Search Smallest numbers");
    System.out.println("<6> Swap Largest numbers and Smallest numbers");
    System.out.println("<7> Delete nth element");
    System.out.println("<8> Insertion of elements"); 
    System.out.println("<9> Delete elements divisible by 3");
    System.out.println("<10> Delete elements divisible by user input");
    System.out.println("Enter < -1 > to Quit <<"); 
    System.out.println();
    System.out.println("Select Operation<< "); 
}
}
public class Loginsystem {

 

    public static void main(String[] args) {
        
       Map<String, String> user_info = new HashMap<>();
       
       user_info.put("jonathan", "admin");
       user_info.put("jayar", "admin");
       user_info.put("michael", "admin");
       user_info.put("ian", "admin");
       user_info.put("kimberly", "admin");
        
       Scanner user_input = new Scanner(System.in);
       System.out.println("Enter your Username: ");
       String username = user_input.nextLine();
       System.out.println("Enter your Password: ");
       String password = user_input.nextLine();
       

        if (user_info.containsKey(username) && user_info.get(username).equals(password)) {
            while (true) {
                login_display.displayChoices(username);
                Scanner op = new Scanner(System.in);
                int operation = op.nextInt();

                if (operation == -1) {
                    System.out.println("Are you sure you want to Exit? y/n ");
                    
                    Scanner con = new Scanner(System.in);
                    String confirm = con.nextLine().toLowerCase();

                    if (confirm.equals("y")) {
                        System.out.println("Goodbye!");
                        break;
                    } else {
                        continue;
                    }
                } 
                else {
                    System.out.println();
                }
                if (operation == 1){
                    System.out.println("<" + operation +"> Search Odd Numbers");
                    FindOddnum.main(args);
                }
                if (operation == 2){
                    System.out.println("<" + operation +"> Search Even Numbers");
                    FindEven.main(args);
                }
                if (operation == 3){
                    System.out.println("<" + operation +"> Swap Odd Numbers and Even Numbers");
                    SwapOddEven.main(args);
                }
                if (operation == 4){
                    System.out.println("<" + operation +"> Search Largest Numbers");
                    FindLargest.main(args);
                }
                if (operation == 5){
                    System.out.println("<" + operation +"> Search Smallest Numbers");
                    FindSmallest.main(args);
                }
                if (operation == 6){
                    System.out.println("<" + operation +"> Swap Largest Numbers and Smallest Numbers");
                    Swap.main(args);
                }
                if (operation == 7){
                    System.out.println("<" + operation +"> Delete nth Element");
                    Deletion.main(args);
                }
                if (operation == 8){
                    System.out.println("<" + operation +"> Insertion of Element ");
                    InsertionOfElements.main(args);
                }
                if (operation == 9){
                    System.out.println("<" + operation +"> Delete Elements Divisible by 3");
                    DeleteElementDivibleByThree.main(args);
                }
                if (operation == 10){
                    System.out.println("<" + operation +"> Delete Elements Divisible by User");
                    DeleteDivisibleByUser.main(args);
                }
                
            }
        } 
        else {
            System.out.println("Login Failed!. Incorrect Username or Password");
        }
        user_input.close(); 
    }
}

    

