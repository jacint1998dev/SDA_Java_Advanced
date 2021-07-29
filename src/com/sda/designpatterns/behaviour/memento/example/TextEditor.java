package com.sda.denisbalaceanu.designpatterns.behaviour.memento.example;

public class TextEditor
{
    private TextWindow textWindow;

    private TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow)
    {
        this.textWindow = textWindow;
    }

    // Finally, we have to update our TextEditor class. As the Caretaker, it will hold the state of the Originator and ask to restore it when needed:
    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

    public void write(String string)
    {
        textWindow.addText(string);
    }

    public void print()
    {
        System.out.println(textWindow.getCurrentText());
    }
}
