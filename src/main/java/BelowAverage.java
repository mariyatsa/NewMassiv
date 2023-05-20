public class BelowAverage {
    public int BelowAverage(int[] sales) {
        int summa = 15;
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < summa)
                monthMin = monthMin + 1;
        }
        return monthMin;
    }
}






