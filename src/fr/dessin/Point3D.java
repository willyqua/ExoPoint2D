package fr.dessin;

import java.util.ArrayList;

public class Point3D extends Point2D {

    private int z;


    public Point3D() {
        super();

        System.out.println("compteur > " + compteur);
    }


    public Point3D(int x, int y, int z) {

        super(x, y);
        this.z = z;
    }

    public void translater(int dX, int dY, int Dz) throws PointException {

        //super.translater(dX,dY);
        this.translater(dX, dY);
        this.z += Dz;

    }

    public String giveName(String name) {
        return "my name is " + name + " on surcharge !";
    }

    public void display() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(getX());
        point.add(getY());
        point.add(this.z);
        System.out.println("point 3D" + point);

    }


    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
