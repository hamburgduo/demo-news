package cn.wjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan  //springboot启动时会扫描webservlet注解并实例化
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
