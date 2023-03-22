package com.sub.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Context {

    public static Map<String, Table> tables = new HashMap<>();

    static {
        List<String> columnNames = Arrays.asList("column1", "column2");
        List<Row> tableRows = new ArrayList<>();
        tableRows.add(new Row("1", "2"));
        tableRows.add(new Row("3", "4"));
        tableRows.add(new Row("5", "6"));

        tables.put("table1", new Table(columnNames, tableRows));
    }

    private String tableName;
    private String columnName;
    private Predicate<String> whereFilter;

    public Context() {
        setDefault();
    }

    public List<String> search() {

        Table table = tables.get(tableName);
        int columnIndex = table.columnNames().indexOf(columnName);
        List<String> result = tables.get(tableName).rows()
                .stream()
                .map(row -> {
                    if (columnIndex == 0) {
                        return row.first;
                    } else {
                        return row.second;
                    }
                })
                .filter(whereFilter)
                .collect(Collectors.toList());

        setDefault();

        return result;
    }

    public void setFilter(Predicate<String> filter) {

        whereFilter = filter;

    }

    public void setTable(String table) {

        this.tableName = table;

    }

    public void setColumn(String column) {

        this.columnName = column;

    }

    private void setDefault() {

        tableName = null;
        columnName = null;
        whereFilter = (c) -> true;

    }

    private record Row(String first, String second) {
    }

    private record Table(List<String> columnNames, List<Row> rows) {
    }

}
