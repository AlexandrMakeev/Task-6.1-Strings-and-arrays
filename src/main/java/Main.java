import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args){
        StatsService service = new StatsService();
        int[] input = {8, 15, 13, 11, 7, 13, 9, 20, 7, 14, 14, 18};
        System.out.println(service.sum(input));
        System.out.println(service.avarage(input));
        System.out.println(service.maxSales(input));
        System.out.println(service.minSales(input));
        System.out.println(service.belowAverageSales(input));
        System.out.println(service.aboveAverageSales(input));


    }
}