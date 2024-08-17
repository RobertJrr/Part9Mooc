package Example3;

class Point3D extends Point {

    private int z;

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public String location(){
        return super.location() + ", " + this.z;
    }

    //also overrde manhattanDistance method
    @Override
    public int manhattanDistanceFromOrigin(){
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }

//    dont need this because same as Point toString method
//    @Override
//    public String toString(){
//        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
//    }


}
