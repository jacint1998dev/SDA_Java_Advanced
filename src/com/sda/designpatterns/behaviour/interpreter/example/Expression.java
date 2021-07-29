package com.sda.denisbalaceanu.designpatterns.behaviour.interpreter.example;

import java.util.List;

interface Expression
{
    List<String> interpret(Context ctx);
}
