package pl.devs.mentoring;

import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("pl.devs.mentoring")
public class PlainSpringApp implements WebMvcConfigurer {
    public static void main(String[] args) throws Exception {
        String docBase = (System.getProperty("java.io.tmpdir"));
        Tomcat server = new Tomcat();
        server.setBaseDir(docBase);
        server.setPort(8080);
        server.getConnector();
        server.addContext("", docBase);

        AnnotationConfigWebApplicationContext spring = new AnnotationConfigWebApplicationContext();
        spring.register(PlainSpringApp.class);
        server.addServlet("", "dispatcher", new DispatcherServlet(spring)).addMapping("/");

        server.start();
        server.getServer().await();
    }
}
