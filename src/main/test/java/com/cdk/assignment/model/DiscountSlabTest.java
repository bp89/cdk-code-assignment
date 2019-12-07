package com.cdk.assignment.model;

import org.junit.Assert;
import org.junit.Test;

public class DiscountSlabTest {

    @Test
    public void calculateDiscount() {

        Assert.assertEquals(new Double(0), getTestDiscountSlab1().calculateDiscount(25000d));
        Assert.assertEquals(new Double(2250), getTestDiscountSlab2().calculateDiscount(25000d));
    }

    public DiscountSlab getTestDiscountSlab1() {
        return DiscountSlab.builder()
                .from(0)
                .to(5000)
                .discount(0)
                .build();
    }

    public DiscountSlab getTestDiscountSlab2() {
        return DiscountSlab.builder()
                .from(0)
                .to(15000)
                .discount(15)
                .build();
    }
}