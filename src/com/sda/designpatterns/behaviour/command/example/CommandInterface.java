package com.sda.denisbalaceanu.designpatterns.behaviour.command.example;

public interface CommandInterface
{
    void execute();

    static void printArray(int[] arr, String type)
    {
        if (arr.length <= 20)
        {
            System.out.print(type + ": ");
            int n = arr.length;
            System.out.print("[");
            for (int j : arr)
            {
                System.out.print(j + " ");
            }
            System.out.println("]");
        }
    }
}
