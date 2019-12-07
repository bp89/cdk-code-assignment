package com.cdk.assignment.utils;

import com.cdk.assignment.model.DiscountSlabList;

public class DiscountUtil {

    public static Double calculatePercentage(Double amount, Double percentage) {
        return amount * percentage / 100;
    }

    public static Double getAmountAfterDiscount(DiscountSlabList discountSlabList, Double purchaseAmount){
        return purchaseAmount - discountSlabList.calculateDiscountAmount(purchaseAmount);
    }
}
