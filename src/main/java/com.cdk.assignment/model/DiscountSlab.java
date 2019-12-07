package com.cdk.assignment.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiscountSlab {
    private double from;
    private double to;
    private double discount;

}
