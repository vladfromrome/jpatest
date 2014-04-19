package models;

import com.avaje.ebean.Ebean;
import play.Logger;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Author: Vladimir Romanov
 * Date: 19.04.14
 * Time: 13:22
 */
@Entity
public class Tagdata extends Model {
    @Id
    public Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    public Set<Tag> tags;


    public Tagdata(Set<Tag> tags) {
        this.tags = tags;
    }


    @Override
    public void delete() {
        /*for (Tag t:tags){
            Logger.info("tagdatas size: "+t.tagdatas.size());
            if (t.tagdatas.size()==1 && t.tagdatas.get(0).equals(this))
                t.delete();
        }*/
        super.delete();
    }

}
