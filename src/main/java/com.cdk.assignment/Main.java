package com.cdk.assignment;

import com.cdk.assignment.model.DiscountSlab;
import com.cdk.assignment.model.DiscountSlabList;
import com.cdk.assignment.utils.DiscountUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter purchase amount");
        Double purchaseAmount = in.nextDouble();

        System.out.println("The price after discount is: " + DiscountUtil.getAmountAfterDiscount(getDiscountSlabList(), purchaseAmount));

    }

    public static DiscountSlabList getDiscountSlabList() {

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