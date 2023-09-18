
package loginsystem;


import java.util.Scanner;

public class Swap {

int findLargest(int []arr){
    
    int big = arr[0];

    for(int i = 1; i < arr.length; i++){
        if (arr[i] > big ){
           big = arr[i];
        }
}
    return big;
}
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
    System.out.print("Before: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

    int big = findLargest(arr);
    int small = findSmallest(arr);

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == big) {
            arr[i] = small;
        } else if (arr[i] == small) {
            arr[i] = big;
        }
    }

    System.out.print("\nAfter: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}


     

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a number(size of 10): ");
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++){
		    arr[i] = inp.nextInt();
		    }
                inp.close();
                
		Swap swapping = new Swap();
                swapping.display(arr);
 
	}
}