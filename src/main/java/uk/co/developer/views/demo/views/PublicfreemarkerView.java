package uk.co.developer.views.demo.views;

import com.yammer.dropwizard.views.View;
import uk.co.developer.views.demo.model.BaseModel;

public class PublicfreemarkerView<T extends BaseModel> extends View {

    private final T model;

    public PublicfreemarkerView(String templateName, T model) {

        super("/views/ftl/"+templateName);
        this.model = model;
    }

    public T getModel() {

        return model;
    }
}
