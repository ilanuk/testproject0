package testclassadapter;

public class TestClassAdapter {
    public static void main(String[] args) {
        AceClass ace = new AceClass("Great Kris");
        AcmeAdapterClass aceAdapter = new AcmeAdapterClass(ace);
        System.out.println( ace.getName());
        System.out.println(aceAdapter.getFirstName());
        System.out.println(aceAdapter.getSecondName());
    }
}
