package by.itstep.Korotkevich.finalProgect.view;

import by.itstep.Korotkevich.finalProgect.model.entity.ChequeTables;
import by.itstep.Korotkevich.finalProgect.model.entity.Dish;
import by.itstep.Korotkevich.finalProgect.model.entity.OrderTables;

public class Table02Check {
    public static void main(String[] args) {

        Printer.print("---YOUR ORDER---");
        Dish[] dishes = OrderTables.getOrder02();

        for (int i = 0; i < dishes.length; i++) {
            Printer.print(dishes[i]);
        }

        Printer.print("-------"
                + "\nTotal cheque = " + ChequeTables.getTotalCheque02() + " $");
    }
}
