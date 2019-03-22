package com.ilan.jaxb.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "com.ilan.jaxb.model")
public class BookStore {

    private ArrayList<Book> bookList;
    private String name;
    private String location;

    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "bookList")
    // XmlElement sets the name of the entities
    @XmlElement(name = "book")
    public ArrayList<Book> getBookList() {
        return bookList;
    }

}
