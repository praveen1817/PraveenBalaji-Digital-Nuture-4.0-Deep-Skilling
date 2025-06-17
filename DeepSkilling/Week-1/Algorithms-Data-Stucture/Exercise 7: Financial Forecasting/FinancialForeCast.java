public class FinancialForeCast {
    public static double financeForecast(double presentvalue, int years, double rate) {
        double futureValue = presentvalue;
        if (years == 0) {
            return futureValue;
        }
        return financeForecast(futureValue,years-1,rate) *(1+rate);
    }

    public static void main(String[] args) {
        double presentValue=12000;
        int years=6;
        double rate=0.09;
       double futureValue1= financeForecast(presentValue,years,rate);
        double futureValue2=financeForecast(15000,4,0.05);
        System.out.println("Future Value: "+futureValue1);
        System.out.println("Future value:  "+futureValue2);
    }
}
