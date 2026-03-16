package com.efub.seminar2.member.dto.response;

import com.efub.seminar2.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class MemberResponse {
    private final Long memberId;
    private final String email;
    private final String nickname;
    private final String university;
    private final String bio;
    private boolean isActive;

    public static MemberResponse fromMemberEntity(Member member){
        return MemberResponse.builder()
                .email(member.getEmail())
                .nickname(member.getNickname())
                .memberId(member.getMemberId())
                .university(member.getUniversity())
                .bio(member.getBio())
                .isActive(member.isActive())
                .build();
    }
}
