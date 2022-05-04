package practice;

public class House {
    private String color;
    private int height;
    public static int length;



    public House(String color, int height) {
        this.color = color;
        this.height = height;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "My house color is " + " " + color + " and the height is " + height;
    }
    public void setLength (int x, int y){
        length = x * y;
    }


    public static void main(String[] args) {
        House house = new House("blue", 8);

        System.out.println(length);
    }
}
