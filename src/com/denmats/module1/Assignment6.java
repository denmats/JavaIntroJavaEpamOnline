package com.denmats.module1;

public class Assignment6 {

    private final Point point;
    private final int X_TOP_START;
    private final int X_TOP_END;
    private final int Y_TOP;
    private final int Y_BOTTOM;
    private final int X_BOTTOM_START;
    private final int X_BOTTOM_END;

    public Assignment6(Point point) {
        this.point = point;
        this.X_TOP_START = -2;
        this.X_TOP_END = 2;
        this.Y_TOP = 4;
        this.Y_BOTTOM = -3;
        this.X_BOTTOM_START = -4;
        this.X_BOTTOM_END = 4;
    }

    public void printIfThePointBelongsToTheArea() {
        System.out.println(doesThePointBelongsToTheArea());
    }

    private boolean doesThePointBelongsToTheArea() {
        boolean pointBelongsTheTopArea = isPointBelongsTheTopArea(X_TOP_START, X_TOP_END, 0, Y_TOP);
        boolean pointBelongsTheBottomArea = isPointBelongsTheBottomArea(X_BOTTOM_START, X_BOTTOM_END, Y_BOTTOM, 0);
        return pointBelongsTheTopArea || pointBelongsTheBottomArea;
    }

    private boolean isPointBelongsTheBottomArea(int x_bottom_start, int x_bottom_end, int y_bottom, int i) {
        return point.getX() >= x_bottom_start && point.getX() <= x_bottom_end && point.getY() >= y_bottom && point.getY() <= i;
    }

    private boolean isPointBelongsTheTopArea(int x_top_start, int x_top_end, int i, int y_top) {
        return point.getX() >= x_top_start && point.getX() <= x_top_end && point.getY() >= i && point.getY() <= y_top;
    }

}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}