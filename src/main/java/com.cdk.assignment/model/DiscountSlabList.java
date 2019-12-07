package com.cdk.assignment.model;

import lombok.Builder;

import java.util.List;

@Builder
public class DiscountSlabList {
    List<DiscountSlab> discountSlabs;

    public Double calculateDiscountAmount(Double amount) {

        return this.discountSlabs
                .stream()
                .mapToDouble(slab -> slab.calculateDiscount(amount))
                .sum();
    }

}
