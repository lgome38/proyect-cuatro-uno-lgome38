public class Main {
    public static void main(String[] args) {


        int numero=1;
        int suma=0;
        do {
            suma=suma+numero;
            System.out.println("num "+numero + " suma = " + suma);
            numero=numero+1;
        }while (numero<=10) ;
        System.out.println("el resultado de la suma es = " + suma);
    }
}