
package loginsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElementDivibleByThree {
     public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(10);
        Scanner user_input = new Scanner(System.in);
        
        //ask user to enter 10 numbers
        System.out.println("Enter 10 number: ");       
        for(int i = 0; i < 10; i++){
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
        
        
        
        //search numbers divisible by 3
        for(int i = nums.size() - 1; i >=0; i--){ //reverse order
            int n = nums.get(i);
            if(n %3 == 0){
               int res = nums.remove(i);
                System.out.println();
                System.out.println("Deleted Numbers: " + res );
            } 
        }
        System.out.println();

        System.out.println("Updated ArrayList: ");
        
        for(int i = 0; i < nums.size(); i++){
            int nn = nums.get(i);
            System.out.println(nn + " ");
        }
     }
}
