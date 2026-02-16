import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Procedimientos myClase= new Procedimientos();

        myClase.numPer(6);

        myClase.saludar("PEPE");

        myClase.tablaMul(4);


        Metodos metodos= new Metodos();

        ArrayList<Integer> enteros =new ArrayList<>();
        enteros.add(9);
        enteros.add(7);
        enteros.add(-2);
        enteros.add(-4);
        System.out.println(metodos.contar(enteros));

        ArrayList<Integer> numeros =new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        System.out.println(metodos.numMayor(numeros));

        ArrayList<Integer> numeros2 =new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);
        System.out.println(metodos.suma(numeros2));
    }

}