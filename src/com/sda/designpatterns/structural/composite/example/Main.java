package com.sda.denisbalaceanu.designpatterns.structural.composite.example;

import java.util.Arrays;

public class Main
{
    public static void main(String args[])
    {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
        Department headDepartment = new HeadDepartment(3, "Head department", Arrays.asList(salesDepartment, financialDepartment));

        salesDepartment.printDepartmentName();
        financialDepartment.printDepartmentName();
        headDepartment.printDepartmentName();
    }
}
