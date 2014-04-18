package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author: Vladimir Romanov
 * Date: 18.04.14
 * Time: 22:54
 */
@Entity
public class CD extends Model{
    @Id
    public Long id;
    public static Finder<Long,CD> FIND = new Finder<>(Long.class, CD.class);

    public int size;


}
