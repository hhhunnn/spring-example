package com.example.board.dto.request.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatchNicknameRequestDto {
    // 패턴 검사 안함

    @NotBlank
    private String email;

    @NotBlank
    private String nickname;
}
