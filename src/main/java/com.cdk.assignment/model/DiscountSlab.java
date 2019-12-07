package com.cdk.assignment.model;

import lombok.Builder;
import lombok.Data;

import static com.cdk.assignment.utils.DiscountUtil.calculatePercentage;

@Data
@Builder
public class DiscountSlab {
    private double from;
    private double to;
    private double discount;

    public Double calculateDiscount(Double amount) {
        Double discount = 0d;
        if (amount > this.getFrom() && amount > this.getTo()) {
            discount = calculatePercentage(this.getTo() - this.getFrom(), this.getDiscount());
        } else if (amount > this.getFrom()) {
            discount = calculatePercentage(amount - this.getFrom(), this.getDiscount());
        }
        System.out.println("-->"+ discount);
        return discount;
    }
}
