package com.cdk.assignment.model;

import lombok.Builder;

import java.util.List;

@Builder
public class DiscountSlabList {
    List<DiscountSlab> discountSlabs;

    public Double calculateDiscountAmount(Double amount) {

        return this.discountSlabs
                .stream()
                .mapToDouble(slab -> {
                    if (amount > slab.getFrom()) {
                        return calculatePercentage(amount - slab.getFrom(), slab.getDiscount());
                    } else if (amount > slab.getFrom() && amount > slab.getTo()) {
                        return calculatePercentage(slab.getTo() - slab.getFrom(), slab.getDiscount());
                    } else {
                        return 0;
                    }
                })
                .sum();

    }

    public Double calculatePercentage(Double amount, Double percentage) {
        return amount * percentage / 100;
    }
}
