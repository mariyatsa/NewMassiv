import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesAnalysisTest {
    @Test
    public void minSales() {
        SalesAnalysis service = new SalesAnalysis();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        SalesAnalysisMax service = new SalesAnalysisMax();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void summaSales() {
        SummaSales service = new SummaSales();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.summaSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        AverageSalesAmount service = new AverageSalesAmount();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.AverageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minS() {
        BelowAverage service = new BelowAverage();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.BelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxS() {
        AboveAverage service = new AboveAverage();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.AboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}