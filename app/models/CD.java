package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Vladimir Romanov
 * Date: 18.04.14
 * Time: 22:54
 */
@Entity
public class CD extends Item{

    //public static Finder<Long,CD> FIND = new Finder<>(Long.class, CD.class);

    public int size;
    /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cd_tags")
    public List<Tag> tags = new ArrayList<Tag>();*/

}
