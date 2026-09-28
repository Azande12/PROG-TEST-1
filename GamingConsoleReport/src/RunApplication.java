import java.util.Scanner;

// 1. REQUIRED INTERFACE
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// 2. REQUIRED ABSTRACT CLASS - implements interface
abstract class Consoles implements IConsoles {
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    // Constructor that accepts console type, store name, and total sales
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Abstract method for subclass
    public abstract void printReport();
}

// 3. SUBCLASS that extends abstract class
class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("**************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

// 4. MAIN CLASS - RunApplication
public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] consoleOptions = {"PS5", "XBOX", "SWITCH"};

        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.println();

        System.out.print("");
        int choice = input.nextInt();
        input.nextLine(); // clear buffer

        // Prevent crash if user enters wrong number
        if (choice < 1 || choice > 3) {
            choice = 1;
        }

        String selectedConsole = consoleOptions[choice - 1];

        System.out.print("Enter the store: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total sales of " + selectedConsole + " consoles for " + storeName + ":");
        int totalSales = input.nextInt();

        // Instantiate ConsoleSales class
        ConsoleSales sale = new ConsoleSales(selectedConsole, storeName, totalSales);
        sale.printReport();

        input.close();
    }
}
