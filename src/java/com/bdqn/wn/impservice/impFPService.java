package com.bdqn.wn.impservice;

import com.bdqn.wn.dao.FPDao;
import com.bdqn.wn.pojo.FinancingProduct;
import com.bdqn.wn.service.FPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class impFPService implements FPService {

    @Autowired
    private FPDao fpDao;


    @Override
    public List<FinancingProduct> getFPS(FinancingProduct financingProduct) {
        return fpDao.getFinancingProduct(financingProduct);
    }
}
