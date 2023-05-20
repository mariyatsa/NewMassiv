public class AboveAverage {
    public int AboveAverage(int[] sales) {
        int summa = 15; // Среднее значение
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > summa)
                monthMax = monthMax + 1;
        }
        return monthMax;
    }
}

