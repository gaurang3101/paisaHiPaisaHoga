import java.util.Scanner;

public class PaisaHiPaisaHoga {
    private float rate;
    private float time;


    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public void calculatingTime() {
        time = 100/rate;
        System.out.println("It would take " + time + " years to double your money at " + rate + "% per annum.");
    }

    PaisaHiPaisaHoga(float rate) {
        this.rate = rate;
    }
}

class BahotTimeHai {
    public static void main(String[] args) {
        float r=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the rate of interest - ");
        r=sc.nextFloat();
        PaisaHiPaisaHoga phph = new PaisaHiPaisaHoga(r);
        phph.calculatingTime();

    }
}