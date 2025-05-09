package org.lessons.java.animals;


public class Delfino extends AbstractAnimal implements INuotante{

        //Override
    
    @Override
    public void verso(){
        System.out.println("Verso delfino: Iii-iiih-iiiii");
    }

    @Override
    public void mangia(){
        System.out.println("Il delfino mangia: pesci, celafopodi, crostacei");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando");
    }
}
