package com.green.madang.manager.book.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(title = "도서 등록", description = "도서 등록시 사용되는 데이터")
public class BookPostReq {
    @Schema(title = "도서 이름", description = "설명할거 있으면 적으며 된다.", example = "학교 종이 땡땡땡!", requiredMode = Schema.RequiredMode.REQUIRED)
    private String bookName;
    @Schema(title = "출판사 이름", example = "한빛출판사", requiredMode = Schema.RequiredMode.REQUIRED)
    private String publisher;
    @Schema(title = "도서 가격", example = "12000", requiredMode = Schema.RequiredMode.REQUIRED)
    private int price;
}
