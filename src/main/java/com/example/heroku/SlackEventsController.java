package com.example.heroku;

import com.slack.api.bolt.App;
import com.slack.api.bolt.servlet.SlackAppServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet("/slack/events")
public class SlackEventsController extends SlackAppServlet {
    public SlackEventsController(App app) {
        super(app);
    }
}