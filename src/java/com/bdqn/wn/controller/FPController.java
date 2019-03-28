package com.bdqn.wn.controller;


import com.bdqn.wn.pojo.FinancingProduct;
import com.bdqn.wn.service.FPService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@Controller
public class FPController {

    @Autowired
    private FPService fpService;

    @RequestMapping("/getFP")
    public void getFinancingProduct(String id, @RequestParam(defaultValue = "0") int risk, HttpServletResponse resp) throws IOException {
        FinancingProduct financingProduct = new FinancingProduct();
        financingProduct.setId(id);
        financingProduct.setRisk(risk);
        List<FinancingProduct> financingProductList = fpService.getFPS(financingProduct);
        PrintWriter out = resp.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        resp.setContentType("application/json;charset=utf-8");
        String result = mapper.writeValueAsString(financingProductList);
        out.print(result);
        out.flush();
        out.close();
    }
}
