package com.aidar.extra.time;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExtraTimeApplication extends Application<ExtraTimeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ExtraTimeApplication().run(args);
    }

    @Override
    public String getName() {
        return "ExtraTime";
    }

    @Override
    public void initialize(final Bootstrap<ExtraTimeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ExtraTimeConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
