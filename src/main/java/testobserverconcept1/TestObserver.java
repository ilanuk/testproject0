package testobserverconcept1;

public class TestObserver {
    public static void main(String[] args) {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Boss boss = new Boss();
        Editor editor = new Editor();

        database.registerObserver(archiver);
        database.registerObserver(boss);
        database.registerObserver(editor);

        database.EditDatabase("Delete" , "record 1");

        database.unregisterObserver(editor);
        database.EditDatabase("Update" , "record 2");
    }
}
