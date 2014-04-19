package controllers;

import com.avaje.ebean.Ebean;
import models.Book;
import models.CD;
import models.Tag;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        deleteAll();
        populate();
        return ok(views.html.index.render("Your new application is ready."));
    }

    public static void populate(){
        Book b1= new Book("War and Peace",1296,new ArrayList<Tag>(
                Arrays.asList(new Tag("war"), new Tag("peace"), new Tag("tolstoy"), new Tag("masterpiece")))
        );
        Book b2= new Book("Divine comedy",416 ,new ArrayList<Tag>(
                Arrays.asList(new Tag("classic"), new Tag("dante"), new Tag("masterpiece")))
        );
        CD cd1=new CD("In a timelapse",700,new ArrayList<Tag>(
                Arrays.asList(new Tag("einaudi"), new Tag("neoclassic"), new Tag("music")))
        );
        CD cd2=new CD("Una mattina",700,new ArrayList<Tag>(
                Arrays.asList(new Tag("einaudi"), new Tag("neoclassic"), new Tag("music"), new Tag("mattina")))
        );

    }

    public static void deleteAll(){
        List<Book> books = Ebean.find(Book.class).findList();
        Ebean.delete(books);
        List<CD> cds= Ebean.find(CD.class).findList();
        Ebean.delete(cds);
        List<Tag> tags= Ebean.find(Tag.class).findList();
        Ebean.delete(tags);

    }
}
