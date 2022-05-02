public class ModelFactory {

    protected int modelNum;
    protected String modelType = "Rust";

    public ModelFactory(int userModel) {
        modelNum = userModel;
    }

    public void setBasicModel(int modelChoice) {
        switch (modelChoice) {
            case 1:
                modelType = "Astromech";
                break;
            case 2:
                modelType = "Protocol";
                break;
            case 3:
                modelType = "Syntax";
                break;
            default:
                modelType = "Rosie Series 5000";
                break;
        }
    }

    public String getModelType() {return modelType;}
}
