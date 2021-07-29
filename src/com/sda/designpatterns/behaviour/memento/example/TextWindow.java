package com.sda.denisbalaceanu.designpatterns.behaviour.memento.example;

public class TextWindow
{
    private StringBuilder currentText;

    public TextWindow()
    {
        this.currentText = new StringBuilder();
    }

    public void addText(String text)
    {
        currentText.append(text);
    }

    // After that, we'll have to provide the TextWindow class with methods to create and consume the Memento object, making the TextWindow our Originator:
    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState save) {
        currentText = new StringBuilder(save.getText());
    }

    public String getCurrentText()
    {
        return currentText.toString();
    }
}
