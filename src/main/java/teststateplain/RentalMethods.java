package teststateplain;

import java.util.Random;

public class RentalMethods {
    final static int FULLY_RENTED = 0;
    final static int WAITING = 1;
    final static int GOT_APPLICATION = 2;
    final static int APARTMENT_RENTED = 3;
    int state = WAITING;

    Random random;
    int numberOfApartmenets;

    public RentalMethods(int numberOfApartmenets) {
        this.numberOfApartmenets = numberOfApartmenets;
        this.random = new Random(System.currentTimeMillis());
    }

    public void getApplication() {
        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry, we are fully rented.");
                break;
            case WAITING:
                state = GOT_APPLICATION;
                System.out.println("Thanks for the application");
                break;
            case GOT_APPLICATION:
                System.out.println("We already Got your application");
                break;
            case APARTMENT_RENTED:
                System.out.println("Hang on, we are renting you the apartment");
                break;
        }
    }

    public void checkApplication() {
        int yesno = random.nextInt() % 10;
        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry, we are fully rented.");
                break;
            case WAITING:
                System.out.println("Thanks for the application");
                break;
            case GOT_APPLICATION:
                if(yesno> 4 && numberOfApartmenets > 0) {
                    System.out.println("Congratulations you are approved");
                    state = APARTMENT_RENTED;
                    rentApartment();
                }
                else {
                    System.out.println("Sorry you are not approved");
                    state = WAITING;
                }
                break;
            case APARTMENT_RENTED:
                System.out.println("Hang on, we are renting you the apartment");
                break;
        }
    }

    public void rentApartment() {
        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry, we are fully rented.");
                break;
            case WAITING:
                System.out.println("Thanks for the application");
                break;
            case GOT_APPLICATION:
                System.out.println("We already Got your application");
                break;
            case APARTMENT_RENTED:
                System.out.println("Hang on, we are renting you the apartment");
                numberOfApartmenets--;
                dispenseKeys();
                break;
        }
    }

    public void dispenseKeys() {
        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry, we are fully rented.");
                break;
            case WAITING:
                System.out.println("Thanks for the application");
                break;
            case GOT_APPLICATION:
                System.out.println("We already Got your application");
                break;
            case APARTMENT_RENTED:
                System.out.println("Here are your keys");
                state = WAITING;
                break;
        }    }
}
