package session.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class CounterListener implements HttpSessionListener{
    public static int count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent event) {
        count++;
//        ServletContext context = event.getSession().getServletContext();
//        context.setAttribute("count", String.valueOf(count));
        System.out.println("11111111111111111111111111111111");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
       // count--;
//        ServletContext context = event.getSession().getServletContext();
//        context.setAttribute("count", String.valueOf(count));
    }
}
