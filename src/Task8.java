import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Task8 {
    public static void task(int n,
                            int[] arr) {

        Vector<Integer> mx = new Vector<Integer>();
        Vector<Integer> mn = new Vector<Integer>();
        int temp=0;
        int st=0;
        int max=0;
        Vector<Integer> m=new Vector<Integer>();
        Vector<Integer> min=new Vector<Integer>();

        if (arr[0] > arr[1]) {
            mx.add(0);
            temp += 2;
        }
        else if (arr[0] < arr[1]) {
            mn.add(0);
            temp += 2;
        }


        for(int i = 1; i <n - 1; i++)
        {
            // Condition for local minima
            if ((arr[i - 1] > arr[i]) &&
                    (arr[i] < arr[i + 1])) {
                mn.add(i);
                temp += 2;
            }
                // Condition for local maxima
            else if ((arr[i - 1] < arr[i]) &&
                    (arr[i] > arr[i + 1])) {
                mx.add(i);

                temp += 2;
            }
            else {
                st -= 1;

                System.out.print("Indexes " + (i-1)+" " +i+" "+(i+1)+" ");
            }


        }


        if (arr[n - 1] > arr[n - 2])
            mx.add(n - 1);

        else if (arr[n - 1] < arr[n - 2])
            mn.add(n - 1);

        if (mx.size() > 0)
        {
            System.out.print("Points of Local " +
                    "maxima are : ");
            for(Integer a : mx)
                System.out.print(a + " ");
            System.out.print("temp "+temp);
            System.out.println();


        }
        else
            System.out.println("There are no points " +
                    "of Local Maxima ");

        if (mn.size() > 0)
        {
            System.out.print("Points of Local " +
                    "minima are : ");
            for(Integer a : mn)
                System.out.print(" " + a + " ");
            System.out.print("temp "+st);
            System.out.println();
        }
        else
            System.out.println("There are no points of " +
                    "Local Maxima ");

    }


    public static void main(String[] args)
    {
        int N = 10;

        int arr[] = { 300, 290, 380, 360, 400,
                600, 750, 450,500, 300 };

        task(N, arr);
    }


}
