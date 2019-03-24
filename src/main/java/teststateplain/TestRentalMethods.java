package teststateplain;

public class TestRentalMethods {
    public static void main(String[] args) {
        RentalMethods rentalMethods = new RentalMethods(10);
        for (int i = 0; i < 10 ; i++) {
            rentalMethods.getApplication();
            rentalMethods.checkApplication();
        }
    }
}
