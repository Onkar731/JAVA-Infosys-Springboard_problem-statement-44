public class CalculateSumOfSeries {
    public static double calculateSum(int N) {
        // N - stands for number of terms
        double seriesSum = 0.0;

        for(double i = 1; i <= N; i++) {
            seriesSum += (1/i);
        }

        // returing series sum
        return seriesSum;
    }
}