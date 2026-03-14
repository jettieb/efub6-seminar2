package com.efub.seminar2.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // Default
    ERROR(400, "요청 처리에 실패했습니다."),

    // member
    USER_NOT_FOUND(401, "존재하는 사용자가 없습니다.");

    private final int status;
    private final String message;
}