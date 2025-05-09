package org.lessons.java.animals;

public class Aquila extends AbstractAnimal {

    //Override

    @Override
    public void verso(){
        System.out.println("Verso aquila: Screee");
    }

    @Override
    public void mangia(){
        System.out.println("L'aquila mangia: mammiferi, uccelli, rettili, pesci, carogne");
    }



}
