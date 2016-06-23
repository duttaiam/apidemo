package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;

/**
 * Book entity managed by Ebean
 */
@Entity
public class Book extends Model {

    @Id
    public Long id;

    public String title;
    public String author;

    public static Finder<Long, Book> find = new Finder<Long,Book>(Book.class);
	
	public static List<Book> list() {
	    return Book.find.all();
	}
}
