package org.lessons.java.animals;

public class Passerotto extends AbstractAnimal implements IVolante{

        //Override
    
    @Override
    public void verso(){
        System.out.println("Verso del passerotto: Chip-chip");
    }

    @Override
    public void mangia(){
        System.out.println("Il passerotto mangia: semi, insetti, frutta, nettare");
    }

    @Override
    public void vola(){
        System.out.println("Sto volando (passerotto)");
    }
}
