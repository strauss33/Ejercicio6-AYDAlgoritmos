
package punto6;

import java.util.Arrays;

public class Punto6 {

    
    public static void main(String[] args) {
        int i,v,j,n,count = 0;
        int A[]={2,1};
        n= A.length;
        for(i=0; i<n ; i++){
            v=A[i]; 	
            j=i-1;
            while (j>=0 && A[j]>v){
                count=count+1;                    		
                A[j+1]=A[j];
                j = j-1;    
            }
            A[j+1]=v;
        }
       
        System.out.println("cantidad de comparaciones "+count); 
        System.out.println(Arrays.toString(A));
    }
    
}
