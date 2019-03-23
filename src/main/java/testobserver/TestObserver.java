package testobserver;

public class TestObserver {
    public static void main(String[] args) {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Boss boss = new Boss();
        Editor editor = new Editor();

        database.addObserver(archiver);
        database.addObserver(boss);
        database.addObserver(editor);

        database.editRecord("Update", "Record 2");
    }
}
