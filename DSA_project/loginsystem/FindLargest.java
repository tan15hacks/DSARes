
package loginsystem;

import java.util.Scanner;


public class FindLargest {
    
 
    int findLargest(int []arr){
    
    int big = arr[0];

    for(int i = 1; i < arr.length; i++){
        if (arr[i] > big ){
           big = arr[i];
        }
}
    return big;
}
    void display(int[] arr) {

    int big = findLargest(arr);
    System.out.println("The Largest Number is: " + big);
    }
    
    public static void main(String[] args){
        	Scanner inp = new Scanner(System.in);
                int arr[] = new int[10];
		System.out.print("Enter 10 numbers: ");

		
		for(int i = 0; i < 10; i++){
		    arr[i] = inp.nextInt();
		    
                }
		FindLargest la = new FindLargest();
                la.display(arr);

		 

    
}
    
}
