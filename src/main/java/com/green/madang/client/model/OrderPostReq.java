package com.green.madang.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderPostReq {
    @JsonIgnore //Swagger 문서에서 보이지 않기 위해
    private int orderId;
    private int custId;
    private int bookId;
}
