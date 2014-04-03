package uk.co.developer.views.demo;


import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;
import uk.co.developer.views.demo.health.DropWizardViewDemoHealthCheck;
import uk.co.developer.views.demo.resources.HomeResource;

public class DemoViewService extends Service<DemoViewConfiguration> {

    public static void main(String[] args) throws Exception {

        new DemoViewService().run(args);
    }

    @Override
    public void initialize(Bootstrap<DemoViewConfiguration> demoViewConfigurationBootstrap) {

        demoViewConfigurationBootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(DemoViewConfiguration demoViewConfiguration, Environment environment) throws Exception {

        // Configure environment
        environment.scanPackagesForResourcesAndProviders(HomeResource.class);

        // Health checks
        environment.addHealthCheck(new DropWizardViewDemoHealthCheck());
    }
}
