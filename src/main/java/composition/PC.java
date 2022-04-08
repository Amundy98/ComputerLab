package composition;

public class PC {
    private Case c;
    private MotherBoard b;
    private Monitor m;

    public PC(Monitor monitor, Case casel , MotherBoard motherBoard ) {
        this.b=motherBoard;
        this.m= monitor;
        this.c=casel;



    }
// instead of using getters an dsetters use a construtcor maybe just yo pass it in

    private void drawLogo(){
        m.drawPixel(  20 ,  30, " blue ");
    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today \n "
                + m + "\n" + c + "\n" + b);
    }



    public void powerUp(){
        c.pressPowerButton();

        drawLogo();

        b.loadProgram("Mac ");
    }

    @Override
    public String toString() {
        return "PC{" +
                "c=" + c +
                ", b=" + b +
                ", m=" + m +
                '}';
    }
}
