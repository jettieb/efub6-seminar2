package com.efub.seminar2.member.controller;

import com.efub.seminar2.member.dto.request.CreateMemberRequest;
import com.efub.seminar2.member.dto.response.MemberResponse;
import com.efub.seminar2.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberResponse> createMember(@Valid @RequestBody CreateMemberRequest request){
        MemberResponse response = memberService.saveMember(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<MemberResponse> getMember(@PathVariable Long memberId){
        MemberResponse response = memberService.getMember(memberId);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long memberId){
        memberService.deleteMember(memberId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
