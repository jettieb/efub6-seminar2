package com.efub.seminar2.member.service;

import com.efub.seminar2.global.exception.CustomException;
import com.efub.seminar2.global.exception.ErrorCode;
import com.efub.seminar2.member.domain.Member;
import com.efub.seminar2.member.dto.request.CreateMemberRequest;
import com.efub.seminar2.member.dto.response.MemberResponse;
import com.efub.seminar2.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponse saveMember(CreateMemberRequest request){
        Member member = CreateMemberRequest.toEntity(request);
        Member savedMember = memberRepository.save(member);
        return MemberResponse.fromMemberEntity(savedMember);
    }

    @Transactional(readOnly = true)
    public MemberResponse getMember(Long memberId){
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        return MemberResponse.fromMemberEntity(member);
    }

    @Transactional
    public void deleteMember(Long memberId){
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        memberRepository.delete(member);
    }
}
