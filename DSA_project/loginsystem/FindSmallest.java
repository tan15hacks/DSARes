
package loginsystem;

import java.util.Scanner;


public class FindSmallest {
    
int findSmallest(int arr []){
    
    int small = arr[0];
    
    for(int i = 1; i < arr.length; i++){
        if (arr[i] < small ){
        small = arr[i];
        }
    }
        
    return small;
    
}
    void display(int[] arr) {

    int small = findSmallest(arr);
    System.out.println("The Smallest Number is: " + small);
    }
    
    public static void main(String[] args){
        	Scanner inp = new Scanner(System.in);
                int arr[] = new int[10];
		System.out.println("Enter 10 numbers: ");
				
		for(int i = 0; i < 10; i++){
		    arr[i] = inp.nextInt();
                }
		FindSmallest la = new FindSmallest();
                la.display(arr);
		 

    
}
    
}
    

