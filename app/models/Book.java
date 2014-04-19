package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Vladimir Romanov
 * Date: 18.04.14
 * Time: 22:55
 */
@Entity
public class Book extends Item {

    //public static Model.Finder<Long,Book> FIND = new Model.Finder<>(Long.class, Book.class);

    public int pageNum;
    /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_tags")
    public List<Tag> tags = new ArrayList<Tag>();*/

    public Book(String name, int pageNum,List<Tag> tags ) {
        super(tags, name);
        this.pageNum = pageNum;
        this.save();
    }
}
