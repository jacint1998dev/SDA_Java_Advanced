package com.sda.denisbalaceanu.designpatterns.behaviour.templatemethod.example;

import com.sda.denisbalaceanu.designpatterns.behaviour.templatemethod.example.Capriciosa;
import com.sda.denisbalaceanu.designpatterns.behaviour.templatemethod.example.Margharita;
import com.sda.denisbalaceanu.designpatterns.behaviour.templatemethod.example.Pizza;

public class TemplateMethod
{

    public static void main(String[] args)
    {
        Pizza margharita = new Margharita();
        Pizza capriciosa = new Capriciosa();
        margharita.bakingPizza();
        System.out.println("-----------------");
        capriciosa.bakingPizza();

//        System.out.println("-----------------");
//        Pizza fruttiDiMare = new FruttiDiMare();
//        fruttiDiMare.bakingPizza();
//
//        Sort bubbleSort = new BubbleSort();
//        Sort bucketSort = new BucketSort();
//        bubbleSort.sortArray(10);
//        System.out.println("-----------------");
//        bucketSort.sortArray(10);
    }

}
