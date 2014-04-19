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

    @OneToOne(cascade = CascadeType.ALL)
    @Basic(optional = false)
    public Tagdata tagdata;
    public String name;


    public Item(Tagdata tagdata, String name) {
        this.tagdata = tagdata;
        this.name = name;
    }
}
