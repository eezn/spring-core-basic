package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {

        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();

//        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//        memberService = ac.getBean("memberService", MemberService.class);
    }

    @Test
    void join() {

        // Given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // When
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // Then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
