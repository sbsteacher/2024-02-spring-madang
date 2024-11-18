package com.green.madang.common.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 응답할 때 사용하는 객체
@Getter
@Setter
@AllArgsConstructor //모든 멤버필드 초기화 할 수 있는 생성자 생성
public class MyResponse<T> {
    @Schema(title = "결과 메시지")
    private String resultMessage;
    @Schema(title = "결과 내용")
    private T resultData;
}
