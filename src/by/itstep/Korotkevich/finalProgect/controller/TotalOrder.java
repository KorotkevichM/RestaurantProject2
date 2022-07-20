package by.itstep.Korotkevich.finalProgect.controller;

import by.itstep.Korotkevich.finalProgect.model.entity.ChequeTables;

public class TotalOrder {

    public static double[] orders(){
        double t1 = ChequeTables.getTotalCheque01();
        double t2 = ChequeTables.getTotalCheque02();
        double t3 = ChequeTables.getTotalCheque03();

        return new double[]{t1, t2, t3};
    }

    public static double sum(){
        return Manager.sum(TotalOrder.orders());
    }

    public static double max(){
        return Manager.max(TotalOrder.orders());
    }

    public static double min(){
        return Manager.min(TotalOrder.orders());
    }

}
