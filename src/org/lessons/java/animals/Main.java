package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        

        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();

        cane.dormi();
        cane.verso();
        cane.mangia();

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
    }
}
