package com.green.madang.manager.customer;

import com.green.madang.manager.customer.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
    int insCustomer(CustomerPostReq p);
}
