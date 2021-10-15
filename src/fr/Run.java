package fr;

import fr.dessin.Point2D;

import java.awt.*;

public class Run {
    public static void main(String [] args){

    Point2D x = new Point2D(4,34);
    Point2D y = new Point2D(10,35);

    x.display();
    x.translater(7,14);
    x.display();

    y.display();
    y.translater(7,10);
    y.display();




    }
}
