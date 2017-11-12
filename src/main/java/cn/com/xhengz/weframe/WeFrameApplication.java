package cn.com.xhengz.weframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xhengz on 2017/11/8.
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.com.xhengz.weframe")
public class WeFrameApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeFrameApplication.class, args);
    }
}
