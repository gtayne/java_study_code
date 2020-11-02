package com.project.pojo7;

import java.util.function.DoubleToIntFunction;

public class SalaryHeightException  extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("工资过多");
    }
}
