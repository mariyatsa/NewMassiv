public class AverageSalesAmount {
    public int AverageSalesAmount(int[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = (summa + sales[i]);
        }
        return summa / 12;

    }
}
