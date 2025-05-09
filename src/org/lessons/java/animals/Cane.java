package org.lessons.java.animals;

public class Cane extends AbstractAnimal{

        //Override
    
    @Override
    public void verso(){
        System.out.println("Verso cane: Bau bau");
    }

    @Override
    public void mangia(){
        System.out.println("Il cane mangia: crocchette o scatolette, carne, pesce,verdure, frutta");
    }
}
