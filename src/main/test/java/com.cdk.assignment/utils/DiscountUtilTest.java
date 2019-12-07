package com.cdk.assignment.utils;

import com.cdk.assignment.model.DiscountSlab;
import com.cdk.assignment.model.DiscountSlabList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DiscountUtilTest {

    @Test
    public void calculatePercentage() {
        assertEquals(new Double(500), DiscountUtil.calculatePercentage(5000d, 10d));
        assertEquals(new Double(0), DiscountUtil.calculatePercentage(0d, 10d));
    }

    @Test
    public void getAmountAfterDiscount() {
        DiscountSlabList discountSlabList = testDiscountList();

        assertEquals(new Double(5900), DiscountUtil.getAmountAfterDiscount(discountSlabList, 6000d));
        assertEquals(new Double(0), DiscountUtil.getAmountAfterDiscount(discountSlabList, 0d));
        assertEquals(new Double(23500), DiscountUtil.getAmountAfterDiscount(discountSlabList, 25000d));
    }

    private DiscountSlabList testDiscountList() {
        return DiscountSlabList
                .builder()
                .discountSlabs(
                        Arrays.asList(
                                DiscountSlab.builder()
                                        .from(0)
                                        .to(5000)
                                        .discount(0)
                                        .build(),
                                DiscountSlab.builder()
                                        .from(5000)
                                        .to(10000)
                                        .discount(10)
                                        .build(),
                                DiscountSlab.builder()
                                        .from(10000)
                                        .to(15000)
                                        .discount(20)
                                        .build()
                        )
                )
                .build();
    }
}