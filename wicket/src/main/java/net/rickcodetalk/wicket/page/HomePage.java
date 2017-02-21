package net.rickcodetalk.wicket.page;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {	
    public HomePage() {
    		add(new Label("helloMessage", "rickcodetalk Wicket tutorial!"));
    		
    		add(new Link("secondPageLink") {

				@Override
				public void onClick() {
					// TODO Auto-generated method stub
					setResponsePage(SecondPage.class);
				}
    			
    		});
    }
}