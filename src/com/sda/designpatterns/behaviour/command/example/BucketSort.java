package com.sda.denisbalaceanu.designpatterns.behaviour.command.example;

public class BucketSort implements CommandInterface
{

    private final int[] arr;

    public BucketSort(int[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void execute()
    {
        long timestamp = System.currentTimeMillis();
        System.out.println("Bucket Sort");
        CommandInterface.printArray(arr, "Before");
        sort();
        CommandInterface.printArray(arr, "After");
        System.out.println("Bucket Sort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");
    }

    public void sort()
    {
        int maxVal = Integer.MIN_VALUE;
        for (int k : arr)
        {
            if (maxVal < k)
            {
                maxVal = k;
            }
        }
        int[] bucket = new int[maxVal + 1];

        for (int k : arr)
        {
            bucket[k]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++)
        {
            for (int j = 0; j < bucket[i]; j++)
            {
                arr[outPos++] = i;
            }
        }
    }

}
