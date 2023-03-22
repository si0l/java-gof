package com.sub.behavioral.interpreter;

import java.util.List;

public class From implements Expression {

    private String table;
    private Where where;

    public From(String table, Where where) {

        this.table = table;
        this.where = where;

    }

    public From(String table) {

        this.table = table;

    }

    @Override
    public List<String> interpret(Context ctx) {

        ctx.setTable(table);

        if (where == null) {

            return ctx.search();
        }

        return where.interpret(ctx);
    }

}
