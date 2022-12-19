package com.walking.lesson25_string.task1;

/**
 * @author Alexandr Korovkin
 */
public class PrintRectangle implements PrintFigure {

    public static final String HYPHEN = "-";
    public static final String VERTICAL_LINE = "|";
    public static final String SPACE = " ";
    public static final String REPLACE = "\n";
    public static final int LENGTH = 10;
    public static final int WIDTH = 5;

    private final StringBuilder horizontalLine = new StringBuilder();
    private final StringBuilder verticalLines = new StringBuilder();
    private final StringBuilder figure = new StringBuilder();
    private final int figureLength;
    private final int figureWidth;

    public PrintRectangle(){
        figureLength = LENGTH;
        figureWidth = WIDTH;
    }

    public PrintRectangle(int figureLength, int figureWidth){
        this.figureLength = figureLength;
        this.figureWidth = figureWidth;
    }

    @Override
    public void printFigure() {
        createHorizontalLine();
        createVerticalLines();
        figure.append(horizontalLine).append(verticalLines).append(horizontalLine);
        System.out.print(figure);
    }

    private void createHorizontalLine() {
        horizontalLine.append(SPACE);
        horizontalLine.append(HYPHEN.repeat(Math.max(0, figureLength)));
        horizontalLine.append(SPACE + REPLACE);
    }

    private void createVerticalLines() {
        verticalLines.append(VERTICAL_LINE);
        verticalLines.append(SPACE.repeat(Math.max(0, figureLength)));
        verticalLines.append(VERTICAL_LINE + REPLACE);
        verticalLines.append(String.valueOf(verticalLines).repeat(Math.max(0, figureWidth)));
    }
}
