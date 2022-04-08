package composition;

public class Case {
    private String model;
    private String powerSupply;
    private Dimension dimension;




    public Case(String model, String powerSupply, Dimension dimension) {
        this.model = model;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }



    public void pressPowerButton(){
        System.out.println("PowerButton Pressed");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}
