package loginsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Deletion {
    
    public static void main(String[] args) {
        
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
        System.out.println();
        System.out.println("Enter Index of an element yoou want to remove: ");
        int delete = user_input.nextInt();
        
        if (delete >= 0 && delete < nums.size()){
            int res = nums.remove(delete);
            System.out.println("Deleted Element: "+ res);
            System.out.println();
        }
        System.out.println("List of Array After After Deletion: ");
        
        for(int i = 0; i < nums.size(); i++){
            int nn = nums.get(i);
            System.out.print(nn + " ");
        }
    
}
}