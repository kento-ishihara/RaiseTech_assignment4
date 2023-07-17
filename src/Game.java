import java.time.YearMonth;

public class Game {
     private String name;
     private String salesAgency;
     private YearMonth yearMonth;
     public Game(String name, String salesAgency, YearMonth yearMonth) {
         this.name = name;
         this.salesAgency = salesAgency;
         this.yearMonth =yearMonth;
     }
    public String getName() {
        return name;
    }
    public  String getSalesAgency() {
        return salesAgency;
    }
    public YearMonth getYearMonth() {
        return yearMonth;
    }
}