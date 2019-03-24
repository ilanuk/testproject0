package testcomposite;

public class TestCorporation {
    public static void main(String[] args) {
        Corporation corporation = new Corporation();
        Division rnd = new Division("R&D");
        rnd.add(new VP("Steve", "R&D"));
        rnd.add(new VP("Bob", "R&D"));
        rnd.add(new VP("Ted", "R&D"));
        rnd.add(new VP("Wills", "R&D"));

        Division sales = new Division("Sales");
        sales.add(new VP("SalesSteve", "Sales"));
        sales.add(new VP("SalesBob", "Sales"));
        sales.add(new VP("SalesTed", "Sales"));
        sales.add(new VP("SalesWills", "Sales"));


        Division westernSales = new Division("Western Sales");
        westernSales.add(new VP("WesternSalesSteve", "Western Sales"));
        westernSales.add(new VP("WesternSalesBob", "Western Sales"));
        westernSales.add(new VP("WesternSalesTed", "Western Sales"));
        westernSales.add(new VP("WesternSalesWills", "Western Sales"));

        sales.add(westernSales);
        VP vp = new VP("Carry", "At large");
        corporation.add(rnd);
        corporation.add(sales);
        corporation.add(vp);

        corporation.print();

    }
}
