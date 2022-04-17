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

    // 수동으로 등록한 빈과 자동으로 등록된 빈의 이름이 같아서 충돌
    // 스프링에서는 수동으로 등록된 빈이 우선되어서 오버라이딩
    // 부트에서는 디폴트로 오류를 발생하도록 바뀜(application.properties 세팅으로 바꿀 수 있음)
    // 애초에 중복 등록 되지 않도록 구성하는 것이 좋음
//    @Bean(name = "memoryMemberRepository")
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
