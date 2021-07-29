package com.sda.denisbalaceanu.designpatterns.behaviour.strategy.example2;

import java.math.BigDecimal;

public interface Discounter
{
    BigDecimal applyDiscount(BigDecimal amount);
}
