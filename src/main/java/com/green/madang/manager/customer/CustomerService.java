package com.green.madang.manager.customer;

import com.green.madang.manager.customer.model.CustomerPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerMapper mapper;

    public int postCustomer(CustomerPostReq p) {
        return mapper.insCustomer(p);
    }
}
