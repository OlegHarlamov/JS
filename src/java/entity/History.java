/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class History implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Reader reader;
    @OneToOne
    private Book book;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateTakeBook;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateReturnBook;

    public History() {
    }

    public History(Reader reader, Book book, Date dateTakeBook,
            Date dateReturnBook) {
        this.reader = reader;
        this.book = book;
        this.dateTakeBook = dateTakeBook;
        this.dateReturnBook = dateReturnBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDateTakeBook() {
        return dateTakeBook;
    }

    public void setDateTakeBook(Date dateTakeBook) {
        this.dateTakeBook = dateTakeBook;
    }

    public Date getDateReturnBook() {
        return dateReturnBook;
    }

    public void setDateReturnBook(Date dateReturnBook) {
        this.dateReturnBook = dateReturnBook;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.reader);
        hash = 79 * hash + Objects.hashCode(this.book);
        hash = 79 * hash + Objects.hashCode(this.dateTakeBook);
        hash = 79 * hash + Objects.hashCode(this.dateReturnBook);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.dateTakeBook, other.dateTakeBook)) {
            return false;
        }
        if (!Objects.equals(this.dateReturnBook, other.dateReturnBook)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "History{" + "id=" + id 
                + ", reader=" + reader.getName()
                + " " + reader.getSurname()
                + ", book=" + book.getName()
                + ", dateTakeBook=" + dateTakeBook 
                + ", dateReturnBook=" + dateReturnBook 
                + '}';
    }
    
    
}
