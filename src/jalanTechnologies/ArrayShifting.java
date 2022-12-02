package jalanTechnologies;

import java.util.Scanner;

public class ArrayShifting{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();    //array size

        System.out.println("Enter position(e.g. 2 or 3) by which you want to move array elements: ");
        int d = sc.nextInt();    //position

        System.out.println("Enter 0 for left shift or 1 for right shift");
        int p = sc.nextInt();    //0 for left or 1 for right
        if(p!=0 && p!=1)
        {
            System.out.println("Invalid Input! please enter p as 0 for left shift or 1 for right shift!");
            System.exit(0);
        }

        int[] array = new int[n];
        System.out.println("enter array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();              //getting original array from user
        }

        if(p==0) {Shifting.left(array, n, d);};
        if(p==1) {Shifting.right(array,n,d);};
    }
}

class Shifting{
    /**Left shift as d=0 */
    public static void left(int[] arr, int n,int d) {
        for (int k = 1; k <= d; k++)
        {
            int temp = arr[0];                            //putting first element in temp variable
            for (int i = 0; i <n-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
        }

        //printing array
        System.out.println("shifted left by position "+d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**right shift as d=1 */
    public static void right(int[] arr, int n,int d) {
        for (int k = 1; k <= d; k++)
        {
            int temp = arr[n-1];                            //putting last element in temp variable
            for (int i=(n-2); i>=0; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        }

        //printing array
        System.out.println("shifted right by position "+d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//Time complexity: O(N)
// Auxiliary Space: O(D)
