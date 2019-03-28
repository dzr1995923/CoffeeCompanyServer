package com.bdqn.wn.dao;

import com.bdqn.wn.pojo.FinancingProduct;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface FPDao {

    //动态获取数据
    List<FinancingProduct> getFinancingProduct(FinancingProduct financingProduct);


    //添加数据
    int AddFinancingProduct(FinancingProduct financingProduct);
}
