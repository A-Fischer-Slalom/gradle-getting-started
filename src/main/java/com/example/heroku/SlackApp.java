package com.example.heroku;

import com.slack.api.bolt.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SlackApp {
    @Bean
    public App initSlackApp() {
        App app = new App().asOAuthApp(true);
        app.command("/hello-oauth-app", (req, ctx) -> {
            return ctx.ack("What's up?");
        });
        return app;
    }
}