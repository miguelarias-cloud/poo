import pilarespoo.Subtipo.*;
import pilarespoo.polimorfismo.Calculadora;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main() {
        Calculadora calc=new Calculadora();

        System.out.println(calc.sumar(3.0,0.4));
        System.out.println(calc.sumar(5,6,7));

        IAnimal g1=new Gato();
        IAnimal p1=new Pajaro();
        IAnimal p2=new Perro();
        Veterinaria v1=new Veterinaria();
        //forma de agregar cosas a una lista
        List<IAnimal> animales= Arrays.asList(g1,p1,p2);

        v1.examinarVariosAnimales(animales);

        g1.comer();
        g1.moverse();
        g1.hacerSonido();
        p1.comer();
        p1.moverse();
        p1.hacerSonido();
        p2.comer();
        p2.moverse();
        p2.hacerSonido();
    }
}