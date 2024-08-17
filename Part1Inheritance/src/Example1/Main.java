package Example1;

class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Combustion","hz","volkswagen","VW GOLF 1L 86-91");
        //Calling method in Engine class
        System.out.println(engine.getEngineType());
        //calling method in Part inherited from Part class
        System.out.println(engine.getManufacturer());
    }
}
