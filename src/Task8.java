import java.util.Vector;

public class Task8 {
    public static void task(int n,
                            int[] arr) {

        Vector<Integer> mx = new Vector<Integer>();
        Vector<Integer> mn = new Vector<Integer>();
        int temp=0;

        if (arr[0] > arr[1]) {
            mx.add(0);
            temp += 2;
        }
        else if (arr[0] < arr[1]) {
            mn.add(0);
            temp += 2;
        }


        for(int i = 1; i < n - 1; i++)
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
            else temp-=1;
        }

        // Checking whether the last point is
        // local maxima or minima or none
        if (arr[n - 1] > arr[n - 2])
            mx.add(n - 1);

        else if (arr[n - 1] < arr[n - 2])
            mn.add(n - 1);

        // Print all the local maxima and
        // local minima indexes stored
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
            System.out.print("temp "+temp);
            for(Integer a : mn)
                System.out.print(a + " ");
            System.out.println();
        }
        else
            System.out.println("There are no points of " +
                    "Local Maxima ");
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 10;

        // Given array arr[]
        int arr[] = { 300, 290, 380, 360, 400,
                600, 750, 450,500, 300 };

        // Function call
        task(N, arr);
    }

}
