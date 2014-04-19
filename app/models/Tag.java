package models;

import com.avaje.ebean.Ebean;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

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

    //@Column(length = 100)    //length is limited by max key length constraint
    //@Column(length = 100,unique = true)
    //@Column(unique = true)
    public String text;

    /*@ManyToMany(mappedBy = "tags")
    public List<Tagdata> tagdatas;*/

    /*@OneToMany(orphanRemoval = true)
    public List<Tagdata> tagdatas;*/

    private Tag(String text) {
        this.text = text;
        this.save();
    }

    public static Tag getTag(String tx){
        Tag t =Ebean.find(Tag.class).where().eq("text",tx).findUnique();
        if (t!=null) return t;
        return new Tag(tx);
    }
}
