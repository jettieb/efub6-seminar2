package com.efub.seminar2.member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "members")
@NoArgsConstructor(access = PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String university;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String studentId;

    @Column(nullable = false)
    private String bio;

    @Builder
    public Member(String email, String password, String nickname, String studentId, String university, String bio) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.university = university;
        this.studentId = studentId;
        this.bio = bio;
    }
}