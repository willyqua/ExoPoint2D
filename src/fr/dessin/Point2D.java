package fr.dessin;

import java.util.ArrayList;

public class Point2D extends Point{

    protected static int compteur;
    private int x;
    private int y;


    public Point2D() {
        compteur++;
    }

    public Point2D(int x, int y) {
        this(); // rappelle constructeur vide. donc compteur++ et l'incrémente.
        this.x = x;
        this.y = y;
    }

    public void translater(int dX, int dY) throws PointException /*ArithmeticException,IllegalArgumentException*/ {
        if(dX < 0) {

            throw new PointException("Le point Dx ne peux pas etre inférieur à zéro");

        }
        this.x += dX;
        this.y += dY;
    }

    public void display() {

        ArrayList<Integer> point = new ArrayList<>();
        point.add(this.x);
        point.add(this.y);
        System.out.println(point);


    }

    public static int getCompteur() {
        return compteur;
    }

    public int getX() {
        return x + 2;
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
