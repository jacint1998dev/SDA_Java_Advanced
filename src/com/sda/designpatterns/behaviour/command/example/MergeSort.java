package com.sda.denisbalaceanu.designpatterns.behaviour.command.example;

public class MergeSort implements CommandInterface
{

    private final int[] arr;

    public MergeSort(int[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void execute()
    {
        long timestamp = System.currentTimeMillis();
        System.out.println("Merge Sort");
        CommandInterface.printArray(arr, "Before");
        sort(arr, arr.length);
        CommandInterface.printArray(arr, "After");
        System.out.println("Merge Sort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");
    }

    public void sort(int[] a, int n)
    {
        if (n < 2)
        {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0)
        {
            System.arraycopy(a, mid, r, 0, n - mid);
        }
        sort(l, mid);
        sort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public void merge(int[] a, int[] l, int[] r, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (l[i] <= r[j])
            {
                a[k++] = l[i++];
            } else
            {
                a[k++] = r[j++];
            }
        }
        while (i < left)
        {
            a[k++] = l[i++];
        }
        while (j < right)
        {
            a[k++] = r[j++];
        }
    }
}