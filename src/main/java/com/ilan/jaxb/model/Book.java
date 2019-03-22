package com.ilan.jaxb.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "book")
@XmlType(propOrder = {"author", "name", "publisher", "isbn"})
public class Book {

    private String name;
    private String author;
    private String publisher;
    private String isbn;

    @XmlElement(name = "title")
    public String getName() {
        return name;
    }
}
