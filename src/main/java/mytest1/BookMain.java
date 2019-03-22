package mytest1;

import com.ilan.jaxb.model.Book;
import com.ilan.jaxb.model.BookStore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookMain {
    private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Book> bookList = new ArrayList<Book>();

        // create books
        Book book1 = new Book();
        book1.setIsbn("978-0060554736");
        book1.setName("The Game");
        book1.setAuthor("Neil Strauss");
        book1.setPublisher("Harpercollins");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setIsbn("978-3832180577");
        book2.setName("Feuchtgebiete");
        book2.setAuthor("Charlotte Roche");
        book2.setPublisher("Dumont Buchverlag");
        bookList.add(book2);

        // create bookstore, assigning book
        BookStore bookstore = new BookStore();
        bookstore.setName("Fraport Bookstore");
        bookstore.setLocation("Frankfurt Airport");
        bookstore.setBookList(bookList);

        // create JAXB context and instantiate marshaller
        JAXBContext context =  JAXBContext.newInstance(BookStore.class);

        Marshaller m = context.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //write to system output
        //marshal  means convert java object to XML format
        m.marshal(bookstore, System.out);

        // Write to File
        m.marshal(bookstore, new File(BOOKSTORE_XML));

        // get variables from our xml file, created before
        System.out.println();
        System.out.println("Output from our XML File: ");

        Unmarshaller um = context.createUnmarshaller();
        BookStore bookStore2 = (BookStore) um.unmarshal(new FileReader(BOOKSTORE_XML));

        ArrayList<Book> bookList2 = bookStore2.getBookList();

        for (Book b: bookList2) {
            System.out.println(b);
        }

    }
}
