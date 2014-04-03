package uk.co.developer.views.demo.resources;


import uk.co.developer.views.demo.model.BaseModel;
import uk.co.developer.views.demo.views.PublicfreemarkerView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HomeResource {

    @GET
    public PublicfreemarkerView index() {

        BaseModel model = new BaseModel();
        return new PublicfreemarkerView("common/home.ftl", model);
    }
}
