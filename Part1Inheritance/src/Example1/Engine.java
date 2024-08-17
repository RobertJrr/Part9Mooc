package Example1;

//Engine IS A Part with some extra properties
class Engine extends Part{

    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer,
                  String description){

        super(identifier,manufacturer,description);
        this.engineType = engineType;
    }

    public String getEngineType(){
        return this.engineType;
    }

}
