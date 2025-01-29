package behavioralPatterns.command.client;

import behavioralPatterns.command.command.OpenTextFileOperation;
import behavioralPatterns.command.command.SaveTextFileOperation;
import behavioralPatterns.command.command.TextFileOperation;
import behavioralPatterns.command.invoker.TextFileOperationExecutor;
import behavioralPatterns.command.receiver.TextFile;

public class TextFileApplication {

    public static void main(String[] args) {

        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }
}
