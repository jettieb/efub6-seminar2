package com.efub.seminar2.member.repository;

import com.efub.seminar2.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
