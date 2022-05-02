public class DroidFactory {
    protected String serialNumber = "R2D2";
    protected String officialDroidModel;
    protected String purpose = "Starship repair/support";

    public DroidFactory() {
    }
    public DroidFactory(String userSerialNumber, int userModelType, String userPurpose) {
        serialNumber = userSerialNumber;
        this.setModelType(userModelType);
        purpose = userPurpose;
    }
    public void speak() {
        System.out.println("This is R2D2 Speaking");
    }

    public void setSerialNumber(String serialNumberUse) {
        serialNumber = serialNumberUse;
    }

    public void setModelType(int modelTypeUse) {
        ModelFactory userModel = new ModelFactory(modelTypeUse);
        userModel.setBasicModel(modelTypeUse);
        officialDroidModel = userModel.getModelType();
    }

    public void setPurpose(String purposeUse) {
        purpose = purposeUse;
    }

    public String getSerialNumber() {return serialNumber;}
    public String getPurpose() {return purpose;}

    public String toString () {
        return String.format("Hello I am %s of the %s model, my purpose here is %s for the next month", serialNumber, officialDroidModel, purpose);
    }
}
