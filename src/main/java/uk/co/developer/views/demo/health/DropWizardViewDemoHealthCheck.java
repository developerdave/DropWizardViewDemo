package uk.co.developer.views.demo.health;


import com.yammer.metrics.core.HealthCheck;

public class DropWizardViewDemoHealthCheck extends HealthCheck {

    public DropWizardViewDemoHealthCheck() {
        super("DropWizard View Demo");
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
