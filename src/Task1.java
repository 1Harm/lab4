import java.util.Scanner;

public class Task1 {
    public static int max(int arr[],int n){
            int max=0;
        for (int i = 0; i < n; i++)
            max=(arr[i+1]*(i+1))-(arr[i]*i);

        return max;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length");
        int n=input.nextInt();
        int [] arr = new int[n-1];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Please enter number");
            int temp = input.nextInt();
            arr[i]=temp;
        }
        max(arr,n);
    }
}
