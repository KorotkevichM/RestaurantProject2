package by.itstep.Korotkevich.finalProgect.view;

import by.itstep.Korotkevich.finalProgect.controller.TotalOrder;

public class Result {
    public static void main(String[] args) {
        Printer.print("Amount of orders per day = " + TotalOrder.sum() + " $"
                + "\nMaximum check per day = " + TotalOrder.max() + " $"
                + "\nMinimum check per day = " + TotalOrder.min() + " $");
    }
    }

