import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsSeviceTest {
    int[] sales = {8, 15, 13, 11, 7, 13, 9, 20, 7, 14, 14, 18};

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        int expetedSum = 149;
        int actualSum = service.sum(sales);
        Assertions.assertEquals(expetedSum, actualSum);
    }

    @Test
    public void avarageSalesAmount() {
        StatsService service = new StatsService();
        double expetedAvarage = 12.416666984558105;
        double actualAvarage = service.avarage(sales);
        Assertions.assertEquals(expetedAvarage, actualAvarage);

    }

    @Test
    public void MaxSales() {
        StatsService service = new StatsService();
        int expetedMax = 8;
        int actualMax = service.maxSales(sales);
        Assertions.assertEquals(expetedMax, actualMax);


    }

    @Test
    public void MinSales() {
        StatsService service = new StatsService();
        int expetedMin = 5;
        int actualMin = service.minSales(sales);
        Assertions.assertEquals(expetedMin, actualMin);
    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        int expetedBelow = 5;
        int actualBelow = service.belowAverageSales(sales);
        Assertions.assertEquals(expetedBelow, actualBelow);
    }
    @Test
    public  void aboveAverage() {
        StatsService service = new StatsService();
        int expetedAbove = 7;
        int actualAbove = service.aboveAverageSales(sales);
        Assertions.assertEquals(expetedAbove,actualAbove);
    }

}

