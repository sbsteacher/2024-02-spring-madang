package com.green.madang.manager.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title="도서 삭제")
public class BookDeleteReq {
    @Schema(title="도서 ID", description = "도서 ID")
    private int bookId;
}
