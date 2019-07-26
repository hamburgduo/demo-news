package cn.wjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;																 
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;																		 

@SpringBootApplication
@ServletComponentScan  //springboot启动时会扫描webservlet注解并实例化
public class App extends SpringBootServletInitializer {	  
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		application.sources(this.getClass());
		return super.configure(application);
    }
 
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
