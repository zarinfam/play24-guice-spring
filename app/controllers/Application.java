package controllers;

import com.google.inject.Inject;
import play.mvc.*;

import services.TestService;
import views.html.*;

public class Application extends Controller {

    @Inject
    private TestService testService;

    public Result index() {
        testService.echo("saeed");
        return ok(index.render("Your new application is ready."));
    }

}
