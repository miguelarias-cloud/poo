import java.util.ArrayList;

public class Metodos {

    public int contar(ArrayList<Integer> enteros){

        int posNums=0;
        int num;
        for(int i=enteros.size()-1; i>=1; i--){
           num=enteros.get(i);
           if(num<0){
               posNums++;
           }

        }
        return posNums;
    }

    public int numMayor(ArrayList<Integer> numeros){
        int mayor=numeros.get(0);
        for(int i=1; i<numeros.size(); i++){
            if(numeros.get(i)>mayor){
                mayor=numeros.get(i);
            }
        }
        return mayor;
    }

    public int suma(ArrayList<Integer> numeros2){
        int total=0;
        int num;
        for(int i=0; i<numeros2.size(); i++){
            num=numeros2.get(i);
            total+=num;
        }
        return total;
    }
}
