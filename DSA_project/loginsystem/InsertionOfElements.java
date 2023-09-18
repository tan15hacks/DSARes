
package loginsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionOfElements {
    
    public static void main(String [] args){
         ArrayList<Integer> nums = new ArrayList<>(6);
        Scanner user_input = new Scanner(System.in);
        
        //ask user to enter 6 numbers
        System.out.println("Enter 6 number: ");       
        for(int i = 0; i < 6; i++){
            int n = user_input.nextInt();
            nums.add(n);   
        }
        //loop the entered numbers of the user , print then stored in array
        System.out.println("List of Array: ");   
        for(int i = 0; i < nums.size(); i++){
            int n = nums.get(i);
            System.out.print(n + " ");
        }
        System.out.println();
        
        System.out.println("Enter Element you want to Insert: " );
        int insert = user_input.nextInt();
        int index = 6; // index

        // Insert the element 
        nums.add(index, insert);
    
        System.out.println("Element " + insert + " added");
        
        System.out.println("Updated ArrayList: ");
        
        for(int i = 0; i < nums.size(); i++){
            int nn = nums.get(i);
            System.out.println(nn + " ");
        }
    }
    
}
