package composition;

public class Monitor {

    private Resolution resolution;
    private String model;
    private String manufacture;

    public Monitor(Resolution resolution, String model, String manufacture) {
        this.resolution = resolution;
        this.model = model;
        this.manufacture = manufacture;
    }



    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + " , " + y + " " + " in color " + color);
    }


    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
