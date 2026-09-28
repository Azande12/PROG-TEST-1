public class Main {
    public static void main(String[] args) {

        //single dimensional array for class
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        //singel dimensional array for console types (header)
        String[] consoleTypes = {"PS5", "XBOX", "SWITCH"};

        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200},
        };

        int[] totalSalesPerCity = new int[3];
        int maxSales = 0;
        String cityWithMostSales = "";

        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][i];
            }
            totalSalesPerCity[i] = total;

            if (total > maxSales) {
                maxSales = total;
                cityWithMostSales = cities[i];

            }

        }
        System.out.println("--------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------");
        System.out.printf("%-20s %-10s %-10s %10s\n", "", consoleTypes[0],consoleTypes[1],consoleTypes[2]);

        for (int i =0;i <cities.length; i ++){
            System.out.printf("%-20 %-10d %-10d %10d\n" ,cities[i],sales[i][0],sales[i][1],sales[i][2]);
        }
        System.out.println("\n--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d\n", cities[i], totalSalesPerCity[i]);
        }

        System.out.println("\nCITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("--------------------------------------------------");
    }
}


