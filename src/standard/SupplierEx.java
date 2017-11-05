package standard;


import util.Member;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SupplierEx {


    public static void callSupplierFunctionalInterface(){

        Supplier supplier = () -> {return new Member();};
        System.out.println(supplier.get());

        BooleanSupplier booleanSupplier = () -> {return true;};
        System.out.println(booleanSupplier.getAsBoolean());

    }

}
