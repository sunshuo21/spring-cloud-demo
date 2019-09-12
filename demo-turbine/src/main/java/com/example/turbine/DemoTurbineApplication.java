package com.example.turbine;

import com.netflix.turbine.streaming.servlet.TurbineStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class DemoTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTurbineApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getServlet() {
        TurbineStreamServlet streamServlet = new TurbineStreamServlet();
        ServletRegistrationBean<TurbineStreamServlet> registrationBean =
                new ServletRegistrationBean<>(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/turbine.stream");
        registrationBean.setName("TurbineStreamServlet");
        return registrationBean;
    }

}
