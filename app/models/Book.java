package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author: Vladimir Romanov
 * Date: 18.04.14
 * Time: 22:55
 */
@Entity
public class Book extends Model {
    @Id
    public Long id;
    public static Model.Finder<Long,Book> FIND = new Model.Finder<>(Long.class, Book.class);

    public int pageNum;
}
