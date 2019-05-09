
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Pedimos el número y comprobamos que sea mayor que 0 y menor que 10000
        System.out.println("Introduzca un número");
            int i=sc.nextInt();
        while((i<=0)||(i>10000)){
            System.out.println("Introduzca un número válido");
                 i=sc.nextInt();
        }
        //Pedimos el otro número y comprobamos(además ha de ser mayor que i)
        System.out.println("Introduzca otro número número");
            int j=sc.nextInt();
        while((j<=0)||(j>10000)){
            System.out.println("Introduzca un número válido");
                j=sc.nextInt();
        }
        //Creamos e inicializamos una variable que guarda el ciclo máximo
        int cMax=0;
        //Hacemos un ciclo para cada número entre i y j
        for(int n=i;n<=j;n++){
            //Creamos e inicializamos una variable que guarda el ciclo actual
            int cActual=1;
            int nActual=n;
            while(nActual!=1){
                if(nActual%2==0){
                    nActual=nActual/2;
                }else{
                    nActual=(3*nActual)+1;
                }
            cActual++;
            }
            //Si el ciclo actual es mayor que el máximo lo establecemos como tal
            if(cActual>cMax){
                cMax=cActual;
            }
        }
        //Mostramos el resultado
        System.out.print(""+i+" "+j+" "+cMax+" ");
    }
}