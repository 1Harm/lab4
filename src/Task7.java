public class Task7 {
    public double task() {


        int n = 10;
        int[] arr = new int[n];
        double temp = 0;
        double max = 0;
        double min;
        for (int i = 0; i < n; i++) {
            min = arr[i];
            if (min > max) {
                min = max;
            }
            if((max-min)<3){
                temp+=i;
            }
            else{
                return temp;
            }

        }
        return temp;
    }
}
