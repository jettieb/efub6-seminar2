package com.efub.seminar2.member.dto.response;

import com.efub.seminar2.member.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class MemberResponse {
    private final Long memberId;
    private final String email;
    private final String nickname;
    private final String university;
    private final String bio;

    public static MemberResponse fromMemberEntity(Member member){
        return MemberResponse.builder()
                .email(member.getEmail())
                .nickname(member.getNickname())
                .memberId(member.getMemberId())
                .university(member.getUniversity())
                .bio(member.getBio())
                .build();
    }
}
