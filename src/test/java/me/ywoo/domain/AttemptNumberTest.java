package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AttemptNumberTest {
    @DisplayName("validateNumber() - 유효하지 않은 횟수 예외처리")
    @Test
    void validateNumber_invalidCounts_exceptionThrown(){
        assertThatThrownBy(()->new AttemptNumber("-3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1회 이상 게임해야 합니다");
    }

    @DisplayName("validateCount() - 유효하지 않은 입력 예외처리")
    @Test
    void validateCount_invalidInput_exceptionThrown(){
        assertThatThrownBy(()->new AttemptNumber("abc"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("횟수는 숫자를 입력해야 합니다.");
    }
}