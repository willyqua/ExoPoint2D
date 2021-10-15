package fr.dessin;

import java.util.ArrayList;

public class Point2D {

    private int x;
    private int y;

    private Point2D() {
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void translater(double dX, int dY) {

        this.x += dX;
        this.y += dY;
    }

    public void display() {

        ArrayList<Integer> point = new ArrayList<>();
        point.add(this.x);
        point.add(this.y);
        System.out.println(point);


    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
