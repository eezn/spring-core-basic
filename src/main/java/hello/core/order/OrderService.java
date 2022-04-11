package hello.core.order;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
