package com.sda.denisbalaceanu.designpatterns.behaviour.command.example2;

public class SaveTextFileOperation implements TextFileOperation {

    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile)
    {
        this.textFile = textFile;
    }
    @Override
    public String execute() {
        return textFile.save();
    }
}
