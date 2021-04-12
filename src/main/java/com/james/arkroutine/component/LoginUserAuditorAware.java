package com.james.arkroutine.component;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LoginUserAuditorAware implements AuditorAware<String> {

    //todo AuditorAware<T> 제네릭 타입에 따른 return 값이므로, String > User 엔티티로 변경할 것
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("tempUser");
    }
}
