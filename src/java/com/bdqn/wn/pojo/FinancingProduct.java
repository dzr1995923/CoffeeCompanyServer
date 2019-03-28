package com.bdqn.wn.pojo;

import java.util.Date;

public class FinancingProduct {
    private String id;//产品代码
    private int risk;//风险评估
    private String income;//预计收益
    private Date saleStarting;//发售起始日
    private Date saleEnd;//发售截止日
    private Date end;//产品到期日


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Date getSaleStarting() {
        return saleStarting;
    }

    public void setSaleStarting(Date saleStarting) {
        this.saleStarting = saleStarting;
    }

    public Date getSaleEnd() {
        return saleEnd;
    }

    public void setSaleEnd(Date saleEnd) {
        this.saleEnd = saleEnd;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
