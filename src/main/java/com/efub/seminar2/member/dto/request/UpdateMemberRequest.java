package com.efub.seminar2.member.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateMemberRequest {

    @NotBlank(message = "닉네임을 입력해야합니다.")
    private String nickname;

    private String bio;
}
