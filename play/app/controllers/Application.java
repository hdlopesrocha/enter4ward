package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result blank_page() {
        return ok(blank_page.render());
    }

    public static Result bootstrap_elements() {
        return ok(bootstrap_elements.render());
    }

    public static Result bootstrap_grid() {
        return ok(bootstrap_grid.render());
    }

    public static Result charts() {
        return ok(charts.render());
    }

    public static Result forms() {
        return ok(forms.render());
    }

    public static Result index_rtl() {
        return ok(index_rtl.render());
    }

    public static Result tables() {
        return ok(tables.render());
    }


}
