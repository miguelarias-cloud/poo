package pilarespoo.Subtipo;

import java.util.List;

public class Veterinaria {

    //Este metodo debe examina cualquier animal
    public void examinar(IAnimal animal) {
        System.out.println("Examinando animal");
        animal.hacerSonido();
        animal.moverse();
    }
    //para examinar varios animales
    public void examinarVariosAnimales(List<IAnimal> animales){
        for(IAnimal animal : animales){
            examinar(animal);
            System.out.println(" ");
        }
    }



}
