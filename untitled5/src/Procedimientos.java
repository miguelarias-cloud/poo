public class Procedimientos {
    public void numPer(int num){
        int num2=0;
        for(int i=num-1; i>=1; i--){
            if(num%i==0){
                num2=num2+i;
            }
        }
        if(num==num2){
            System.out.println("El numero "+num+" es perfecto");
        } else{
            System.out.println(num+" no es perfecto");
        }

    }
    public void saludar(String nombre){
        System.out.println("HOLA! "+nombre);
    }
    public void tablaMul(int numero){
        for(int i=1; i<=10; i++){
            System.out.println("Multipplicado por "+i+" = "+numero*i);
        }
    }
}
