package com.sda.design_patterns.firstprojtest.momento;

import com.sda.design_patterns.firstprojtest.state.Canvas;
import com.sda.design_patterns.firstprojtest.state.EraserTool;
import com.sda.design_patterns.firstprojtest.state.SelectionTool;
import com.sda.design_patterns.firstprojtest.state.abuse.Stopwatch;

public class Main {
    public static void main(String[] args) {

        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();

    }
}
