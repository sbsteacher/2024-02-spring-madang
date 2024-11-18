package com.green.madang.manager.customer;

import com.green.madang.manager.customer.model.CustomerGetReq;
import com.green.madang.manager.customer.model.CustomerGetRes;
import com.green.madang.manager.customer.model.CustomerPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerMapper mapper;

    public int postCustomer(CustomerPostReq p) {
        return mapper.insCustomer(p);
    }

    public List<CustomerGetRes> getCustomerList(CustomerGetReq p){
        //page 로직 처리 >> startIdx값 세팅
        //(page - 1) * size;
        int startIdx = (p.getPage() - 1) * p.getSize();
        p.setStartIdx(startIdx);
        return mapper.selCustomerList(p);
    }

}
