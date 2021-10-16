package fr;

import fr.dessin.*;

public class Run {
    public static void main(String[] args) {



        try {
            Point2D p1 = new Point2D(4, 34);
            System.out.println(p1.getX());
            //System.out.println(p1.x + 2);

            p1.display();
            p1.translater(7, 14);
            p1.display();

            Point3D p2 = new Point3D(5, 5, 5);
            p2.display();
            p2.translater(5, 5, 5);

            //new Point3D(5, 5, 5).display().translater(5, 5, 5);

            p2.display();
            p2.translater(7, 10);
            p2.display();
            System.out.println(Point2D.getCompteur());
            //new Point(); can't be instanciated
            System.out.println(p1.giveName("point 2d"));
            System.out.println(p2.giveName("point 3d"));
        } catch (PointException e) {
            System.out.println(e.getMessage());
        }

        Chain chain = new Chain();
        chain.methodA("on").methodB("enchaine").methodA("les").methodB("methodes").methodB("direct"); // the methods are chained.


    }
}
