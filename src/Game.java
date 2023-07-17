public class Game {
     private String name;
     private String salesAgency;
     private double yearMonth;
     public Game(String name, String salesAgency, double yearMonth) {
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
    public double getYearMonth() {
        return yearMonth;
    }
}