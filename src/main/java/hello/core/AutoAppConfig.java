package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(

        basePackages = "hello.core",
        // 지정하지 않으면 @ComponentScan 이 붙은 설정 정보 클래스의 패키지가 시작위치가 된다.
        // hello.core 시작 루트에 AppConfig 같은 메인 설정 정보를 두고, @ComponentScan 설정하고
        // basePackages 지정은 생략하는 게 좋다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
