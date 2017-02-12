package net.rickcodetalk.wicket.page;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {	
    public HomePage() {
	add(new Label("helloMessage", "rickcodetalk Wicket tut!"));
    }
}