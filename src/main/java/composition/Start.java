package composition;

public class Start {

    public static void main(String[] args) {

        Resolution resolution = new Resolution(20, 30);
        Monitor monitor = new Monitor(resolution, "Dell", "Dcon");
        MotherBoard mb = new MotherBoard("Apple", "Foxconn", 2, 3, "bios");
        Dimension dimension = new Dimension(45, 6,  7);
        Case casel = new Case("Dell", "vevo", dimension);

        PC dell = new PC(monitor, casel, mb);

        dell.description();
        dell.powerUp();

















    }

}
