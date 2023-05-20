public class SalesAnalysisMax {
    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int a = 0; a < sales.length; a++) {
            if (sales[a] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = a; // запомним его как минимальный
            }
        }
        return maxMonth + 1;
    }
}
