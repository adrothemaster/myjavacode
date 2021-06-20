package day30_loops_array;

public class ArrayLoopsWithConditions {
    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China",
                "United States", "Russia"};

        System.out.println("------- prices less than 100 -------");

        for (double eachPrice : prices) {
            if (eachPrice < 100.0){
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println();
        System.out.println("------- prices more than 100 -------");



        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 100 ) {
                System.out.print(prices[i] + ", ");
            }
        }
        System.out.println("\n----- prices between 10 and 70 inclusive -------");

        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.print(price + " ");
            }
        }

        System.out.println("\n------ count the prices more then 50 -------");

        int count = 0;

        for (double each : prices ) {
            if (each > 50){
                count++;

            }
        }

        System.out.println("count = " + count);

        System.out.println("\n----- countries with name length more than 7 - inclusive -----");

        for (String country : countries) {
            if (country.length() >= 7){
                System.out.print(country + " ");
            }
        }
    }
}
