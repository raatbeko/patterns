package behavioralPatterns.command.command;

import behavioralPatterns.command.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation {

    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}