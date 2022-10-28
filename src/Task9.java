public class Task9 {
    public static  class TaskNine {

        public void eff(int N, int[] arr) {
            int[] fluctuations = new int[N];
            double[] point_diff = new double[N];


            for (int i = 0; i < N; i++) {
                if (i+1==N) break;
                else {
                    point_diff[i] = arr[i + 1] - arr[i];
                    if (Math.abs(point_diff[i] / arr[i]) < 0.05){
                        fluctuations[i] = -1;
                    } else if (point_diff[i] / arr[i] > 0.05) {
                        fluctuations[i] = 2;
                    } else if (point_diff[i] / arr[i] < 0.05){
                        fluctuations[i] = -2;
                    }
                }
            }

            int[] startingIndexes = new int[N];
            int[] endIndexes = new int[N];
            int[] fluctuation_counter = new int[N];
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (j + 1 == N) break;
                    else {
                        if (fluctuations[i] > 0) {
                            if (fluctuations[j] > 0) {
                                startingIndexes[i] = i;
                                fluctuation_counter[i]++;

                                if (fluctuations[j + 1] < 0) {
                                    endIndexes[i] = j + 1;
                                    break;
                                }

                            } else break;
                        }

                    }
                }
            }
            int index = 0;
            int max = fluctuation_counter[N - 1];
            for (int i = 0; i < N; i++) {
                if (fluctuation_counter[i] > max) {
                    max = fluctuation_counter[i];
                    index = i;
                }
            }
            System.out.println("Most fluctuation period: starting in index " + startingIndexes[index] + " "
                    + "and ends in " + endIndexes[index]  );
        }

        public static void main(String[] args) {
            int N = 10;

            TaskNine t = new TaskNine();

            int arr[] = {300, 290, 380, 360, 400,
                    600, 750, 450, 500, 300};

            t.eff(N, arr);
        }
    }
}