package com.tinamusic.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethodDto {
    private String id;
    private String account;
    private int paymentOrder;
    private boolean isLoyaltyAccount;
    private String type;
}
