package org.example.week6.NightSky;
import java.util.*;

public class NightSky {
    Random random = new Random();

    private double desnity;
    private int width;
    private int height;

    public NightSky(double density) {
        this(density, 20, 10);
    }
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    public NightSky(double desnity, int width, int height) {
        this.desnity = desnity;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        for (int i=0; i<width; i++) {
            if (random.nextDouble() < desnity) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        starsInLastPrint=0;
        for (int i=0; i<height; i++) {
            printLine();
            System.out.print("\n");
        }
    }

    private int starsInLastPrint = 0;

    public int starsInLastPrint() {
        return starsInLastPrint;
    }

    public static void main(String[] args) {
        /// PART 1
//        NightSky nightSky = new NightSky(0.1, 40, 10);
//        nightSky.printLine();
        /// PART 2
//        NightSky nightSky = new NightSky(8, 4);
//        nightSky.print();
        /// PART 3
        NightSky nightSky = new NightSky(0.5, 8, 4);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
        System.out.println("");
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
    }
}
