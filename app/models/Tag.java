package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author: Vladimir Romanov
 * Date: 18.04.14
 * Time: 22:57
 */
@Entity
public class Tag extends Model{
    @Id
    public Long id;
    //public static Finder<Long,Tag> FIND = new Finder<>(Long.class, Tag.class);
    public String text;

    public Tag(String text) {
        this.text = text;
    }
}
