import java.util.Vector;

public class Task6 {
    public static int localMin(int n,
                           int[] arr, int step) {
        Vector<Integer> mn = new Vector<Integer>();
        int temp = 0;


        if (arr[0] < arr[1]) {
            mn.add(0);
            temp += 2;
        }


            for (int i = 1; i < n - 1; i++) {
                if ((arr[i - 1] > arr[i]) &&
                        (arr[i] < arr[i + 1])) {
                    mn.add(i);
                    temp += 2;
                    step+=10;
                }
            }
            return step;

    }

    public int descend(int step) {

        step += 1;
        return step;
    }

    public int сlimb(int step) {
        step += 1;
        return step;
    }

    public int Step(int step) {
        step += 1;
        return step;
    }
}

