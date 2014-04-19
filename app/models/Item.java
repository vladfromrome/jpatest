package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Vladimir Romanov
 * Date: 18.04.14
 * Time: 22:53
 */
@MappedSuperclass
public class Item extends Model {
    @Id
    public  Long id;

    @ManyToMany(cascade = CascadeType.ALL,targetEntity = Tag.class,fetch = FetchType.EAGER)
    @Column(unique = true)
    //@JoinTable(name = "Item_Translation")
    public List<Tag> tags;
    public String name;

    public Item(List<Tag> tags, String name) {
        this.tags = tags;
        this.name = name;
    }
}
