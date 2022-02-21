package com.gf.book.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
