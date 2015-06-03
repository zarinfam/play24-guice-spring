package controllers;

import com.google.inject.Inject;
import play.*;
import play.mvc.*;

import services.TaskService;
import views.html.*;

public class Application extends Controller {

    @Inject
    private TaskService taskService;

    public Result index() {
        taskService.echo("saeed");
        return ok(index.render("Your new application is ready."));
    }

}
