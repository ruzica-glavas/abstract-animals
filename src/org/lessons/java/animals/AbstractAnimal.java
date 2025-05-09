package org.lessons.java.animals;

public abstract class AbstractAnimal {

    //Metodo comune a tutti quindi implementato
    public void dormi (){
        System.out.println("Zzz");
    }

    //Metodi che devono essere successivamente implementati
    public abstract void verso();
    public abstract void mangia();

}
