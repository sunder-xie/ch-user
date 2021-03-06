package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;

public class ShopDefaultLog {
    private String serialCode;

    private String userId;

    private String defaultReason;

    private Timestamp deductDate;

    private Double deductBalance;

    private Long operId;

    private String operName;

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode == null ? null : serialCode.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDefaultReason() {
        return defaultReason;
    }

    public void setDefaultReason(String defaultReason) {
        this.defaultReason = defaultReason == null ? null : defaultReason.trim();
    }

    public Timestamp getDeductDate() {
        return deductDate;
    }

    public void setDeductDate(Timestamp deductDate) {
        this.deductDate = deductDate;
    }

    public Double getDeductBalance() {
        return deductBalance;
    }

    public void setDeductBalance(Double deductBalance) {
        this.deductBalance = deductBalance;
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }
}