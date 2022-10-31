public class Task9 {
    public static  class TaskNine {

        public void fluc(int n, int[] arr) {
            int[] fluctuations = new int[n];
            double[] point_diff = new double[n];


            for (int i = 0; i < n; i++) {
                if (i+1==n) break;
                else {
                    point_diff[i] = arr[i + 1] - arr[i];
                    if (point_diff[i] / arr[i] > 0.05) {
                        fluctuations[i] = 2;}
                    else if (Math.abs(point_diff[i] / arr[i]) < 0.05){
                        fluctuations[i] = -1;
                    }
                     else if (point_diff[i] / arr[i] < 0.05){
                        fluctuations[i] = -2;
                    }
                }
            }

            int[] a = new int[n];
            int[] b = new int[n];
            int[] fluctuation_counter = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (j + 1 == n) break;
                    else {
                        if (fluctuations[i] > 0) {
                            if (fluctuations[j] > 0) {
                                a[i] = i;
                                fluctuation_counter[i]++;

                                if (fluctuations[j + 1] < 0) {
                                    b[i] = j + 1;
                                    break;
                                }

                            } else break;
                        }

                    }
                }
            }
            int index = 0;
            int max = fluctuation_counter[n-1];
            for (int i = 0; i < n; i++) {
                if (fluctuation_counter[i] > max) {
                    max = fluctuation_counter[i];
                    index = i;
                }
            }
            System.out.println("Most fluctuation period: starting in index " + a[index] + " "
                    + "and ends in " + b[index]  );
        }

        public static void main(String[] args) {
            int n = 10;

            TaskNine t = new TaskNine();

            int arr[] = {300, 290, 380, 360, 400,
                    600, 750, 450, 500, 300};

            t.fluc(n, arr);
        }
    }
}