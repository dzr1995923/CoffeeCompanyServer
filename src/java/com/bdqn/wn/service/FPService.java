package com.bdqn.wn.service;

import com.bdqn.wn.pojo.FinancingProduct;

import java.util.List;


public interface FPService {
    //查询信息
    List<FinancingProduct> getFPS(FinancingProduct financingProduct);
}
