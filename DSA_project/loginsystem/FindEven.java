
package loginsystem;

import java.util.Scanner;

public class FindEven {
     void even_num(int[] arr) {
        
        System.out.print("Even Numbers: ");
       for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
           if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers<<  ");
           for(int i = 0; i < arr.length; i++){
               arr[i] = scanner.nextInt();
           }
           FindEven findingEven = new FindEven();
           findingEven.even_num(arr);

    }
}
