package controllers;

import play.libs.*;
import play.mvc.*;

import models.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to Book API.
 */
public class BookController extends Controller {

    /**
     * An action that returns a JSON array of available books.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/books</code>.
     */
    public Result list() {
        return ok(Json.toJson(Book.list())).as("application/json");
    }

}
