package com.sub.behavioral.command;

public class CommandApp {

    public static void main(String[] args) {

        objectCommand();
        lambdaCommand();
        lambdaMethodReferenceCommand();

    }

    private static void objectCommand() {

        TextFileOperationExecutor executor = new TextFileOperationExecutor();

        System.out.println(executor.executeOperation(new OpenTextFileOperation(new TextFile("file1"))));
        System.out.println(executor.executeOperation(new SaveTextFileOperation(new TextFile("file2"))));

    }

    private static void lambdaCommand() {

        TextFileOperationExecutor executor = new TextFileOperationExecutor();

        System.out.println(executor.executeOperation(() -> {
            TextFile file = new TextFile("file1");
            return file.open();
        }));
        System.out.println(executor.executeOperation(() -> {
            TextFile file = new TextFile("file2");
            return file.save();
        }));

    }

    private static void lambdaMethodReferenceCommand() {

        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        TextFile file1 = new TextFile("file1");
        TextFile file2 = new TextFile("file2");

        System.out.println(executor.executeOperation(file1::open));
        System.out.println(executor.executeOperation(file2::save));

    }

}
