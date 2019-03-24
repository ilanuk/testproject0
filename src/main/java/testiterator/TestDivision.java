package testiterator;

public class TestDivision {
    public static void main(String[] args) {
        Division division = new Division("Sales");
        division.add("Ted");
        division.add("Fred");
        division.add("Bob");
        division.add("Wills");
        division.add("Kris");
        DivisionIterator iterator = division.iterator();

        while (iterator.hasNext()) {
            VP vp = iterator.next();
            System.out.println(vp);
        }
    }
}
