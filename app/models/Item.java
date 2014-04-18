package models;

import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Author: Vladimir Romanov
 * Date: 18.04.14
 * Time: 22:53
 */
@MappedSuperclass
public class Item extends Model {
    @Id
    public  Long id;


    public String name;
}
