package javaapplication5;

import java.util.*;

public class ListaDinos {
    public static void main(String[]main){
        //declaramos la entrada standar
        Scanner s=new Scanner(System.in);
        //Apuntadores
        int j=0,c=0;
        //arreglo donde pondremos los nombres de los ddinosaurios
        Dinos[] d=new Dinos[1000];
        //string para la entrada standar
        String lista;
        //imprimimos las instrucciones para escribir los nombres
        System.out.println("Escibe los nombres de los dinosaurios separadolos con un Espacio");
        //guardamos la entrade en "lista"
        lista=s.nextLine();
        
        /*ciclo para poner los nombres dentro del arreglo.
        el nombre se introduce letra por letra a un String hasta que encontremos un espacio
        dentro del arreglo asignamos a la casilla correspondiente el nombre que almacena el string
        */
        for (int i = 0; i <=lista.length(); i++) {
            //con este contador nos despazamos dentro del string
            j=i;
            //String que almacena el nombre
            String t="";
            //ciclo con el que almacenamos el nombre en el string
            while (j!=lista.length()&&lista.charAt(j)!=' ') {
                t+=lista.charAt(j);
                j++;
            }
            d[c]=new Dinos(t);
            //reseteamos el string
            t="";
            //con este contador nos despazamos dentro del arreglo
            c++;
            //igualamos i con j hasta la casilla del espacio para comenzar con la siguiente palabra
            i=j;
        }
        
        /*Volvemos a usar un contador para obtener la cantidad de casillas que almacenan un nombre
        lo inicializamos en 1 y con un ciclo recorremos el arreglo incrementando el contador
        */
        j=1;
        
        while (d[j]!=null) {
            j++;
        }
        //utilizamos el bubble sort para ordenar el arreglo obteniendo el largo del nombre desde la clace Dinos
        for (int i = 0; i < j; i++) {
            for (int k = 1; k < j; k++) {
                if (d[k-1].getTamañoNombre()>d[k].getTamañoNombre()) {
                    String t=d[k-1].getNombre();
                    d[k-1].setNombre(d[k].getNombre());
                    d[k].setNombre(t);
                }
            }
        }
        //Usamos uno de los contadores para imprimir las casillas
        j=0;
        while (d[j]!=null) {
            System.out.println(d[j].getNombre()+" ("+d[j].getTamañoNombre()+") ");
            j++;
        }
    }
}
