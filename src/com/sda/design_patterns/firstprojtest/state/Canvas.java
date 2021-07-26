package com.sda.design_patterns.firstprojtest.state;

public class Canvas {
    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public Tool setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
        return currentTool;
    }
}
