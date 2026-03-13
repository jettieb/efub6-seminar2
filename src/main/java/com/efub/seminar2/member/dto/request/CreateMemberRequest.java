package com.efub.seminar2.member.dto.request;

import com.efub.seminar2.member.domain.Member;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateMemberRequest {
    @NotBlank(message = "이메일을 입력해야합니다.")
    private final String email;
    @NotNull(message = "비밀번호를 입력해야합니다.")
    private final String password;
    @NotBlank(message = "닉네임을 입력해야합니다.")
    private final String nickname;
    @NotBlank(message = "학교명을 입력해야합니다.")
    private final String university;
    @NotBlank(message = "학번을 입력해야합니다.")
    private final String studentId;

    public static Member toEntity(CreateMemberRequest request) {
        return Member.builder()
                .email(request.email)
                .password(request.password)
                .nickname(request.nickname)
                .university(request.university)
                .studentId(request.studentId)
                .bio("안녕하세요!")
                .build();
    }
}