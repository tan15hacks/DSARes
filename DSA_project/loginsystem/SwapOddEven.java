
package loginsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapOddEven {
    
    public static void main (String [] args){
        ArrayList<Integer> nums = new ArrayList<>(10);
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Enter 10 number: ");
        
        for(int i = 0; i < 10; i++){
            int n = user_input.nextInt();
            nums.add(n);
            
        }
        System.out.println("List of Arrays Before: ");
        
        for(int i = 0; i < nums.size(); i++){
            int n = nums.get(i);
            System.out.print(n + " ");
        }
        
        ArrayList<Integer> oddnum = new ArrayList<>();
        ArrayList<Integer> evennum = new ArrayList<>();

        for (int i = 0; i < nums.size();i++){
            int n = nums.get(i);
            if (n % 2 == 0 ){
                evennum.add(n);
            }
            else{
                oddnum.add(n);
            }
        } 
        
        ArrayList<Integer> swapingnum = new ArrayList<Integer>();
        
        swapingnum.addAll(oddnum);
        swapingnum.addAll(evennum);
        
        System.out.println();
        System.out.print("Updated List: "+ swapingnum);
    
        
    }
}
