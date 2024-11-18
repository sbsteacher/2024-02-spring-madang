package com.green.madang.manager.book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookGetReq {
    @Parameter(name = "페이지값", description = "선택된 페이지값", example = "1", required = true)
    private int page;
    @Parameter(name = "페이지 당 아이템 수", description = "한 페이지마다 보여질 아이템 수", example = "30", required = true)
    private int size;
    @Parameter(name = "검색 텍스트", description = "도서 제목에서 검색을 한다.", example = "검색 텍스트")
    private String searchText;
    @JsonIgnore //Swagger 문서에서 멤버필드가 안 나왔으면 할 때 이 애노테이션을 붙이면 된다.
    private int startIdx; //(page - 1) * size
}
