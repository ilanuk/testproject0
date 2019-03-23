package testadapter;

public class TestAdapter {
    public static void main(String[] args) {
        AceInterface ace = new AceClass("Albert Einstein");
        AcmeInterface acme = new AceToAcmeAdapter(ace);

        System.out.println( ace.getName());
        System.out.println( acme.getFirstName() );
        System.out.println(acme.getSecondName());
    }
}
