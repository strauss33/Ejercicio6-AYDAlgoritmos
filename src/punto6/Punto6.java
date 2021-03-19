
package punto6;

import java.util.Arrays;
import java.util.Scanner;

public class Punto6 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,v,valor,j,n,tam,count = 0;
        System.out.println("Ingrese el tamaño del arreglo");
        tam= in.nextInt();
        
        int [] A= new int[tam];
        n= A.length;
        
        for(i=0; i<n;i++){
            System.out.println("Valor a ingresar en la posicion "+ i);
            valor = in.nextInt();
            A[i]=valor;
        }
       
        for(i=1; i<n ; i++){
            v=A[i]; 	
            j=i-1;
            while (j>=0 && A[j]>v){
                count=count+1;                    		
                A[j+1]=A[j];
                j = j-1;    
            }
            count= count+1;
            A[j+1]=v;
        }
       
        System.out.println("cantidad de comparaciones "+count); 
        System.out.println(Arrays.toString(A));
    }
    
}
