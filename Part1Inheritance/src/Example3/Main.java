package Example3;

import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4,8));
        points.add(new ColorPoint(1,1,"green"));
        points.add(new ColorPoint(2,4,"blue"));
        points.add(new Point3D(5,2,8));
        points.add(new Point(0,0));

        for(Point p : points){
            System.out.println(p);
        }
    }
}

//Person person = new Student();
//Person type variable referencing Student object
//actual type of object is student
