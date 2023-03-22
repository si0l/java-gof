package com.sub.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private final List<TextFileOperation> operations = new ArrayList<>();

    public String executeOperation(TextFileOperation operation) {

        operations.add(operation);

        return operation.execute();
    }
}
