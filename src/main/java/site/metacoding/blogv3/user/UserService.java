package site.metacoding.blogv3.user;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service // IoC 등록
public class UserService {

    // DI
    private final UserRepository userRepository;

    @Transactional
    public void 패스워드초기화() {

    } // 더티체킹 (update)

    @Transactional
    public void 회원가입() {

    }

    public void 유저네임중복체크() {

    }

}
