package com.sub.behavioral.interpreter;

import java.util.List;

public class InterpreterApp {

    public static void main(String[] args) {

        Expression query = new Select("column1", new From("table1"));
        Context ctx = new Context();

        List<String> result = query.interpret(ctx);
        System.out.println(result);

        Expression query2 = new Select("column2", new From("table1", new Where(column -> column.contains("2"))));
        List<String> result2 = query2.interpret(ctx);
        System.out.println(result2);

    }

}
