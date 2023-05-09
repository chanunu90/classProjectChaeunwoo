package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class W2 implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("contextDestroyed()...");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("contextInitialized()...");
    }
	
}
