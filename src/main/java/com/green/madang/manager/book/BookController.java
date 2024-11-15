package com.green.madang.manager.book;

import com.green.madang.common.model.MyResponse;
import com.green.madang.manager.book.model.BookGetReq;
import com.green.madang.manager.book.model.BookGetRes;
import com.green.madang.manager.book.model.BookPostReq;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor //생성자 만들어 준다.
@RequestMapping("manager/book")
@Tag(name = "도서", description = "도서 API")
public class BookController {
    private final BookService service;

    @PostMapping
    @Operation(summary = "도서 입고", description = "도서 입고 처리 API")
    public MyResponse<Integer> postBook(@RequestBody BookPostReq p) {
        int result = service.postBook(p);
        MyResponse<Integer> response = new MyResponse<>("책 등록 완료", result);
        return response;
    }

    @GetMapping
    @Operation(summary = "도서 리스트", description = "도서 정보 리스트 보기 API")
    public MyResponse<List<BookGetRes>> getBookList(@ParameterObject @ModelAttribute BookGetReq p) {
        List<BookGetRes> list = service.getBookList(p);
        return new MyResponse<>(p.getPage() + "페이지 데이터", list);
    }
}
