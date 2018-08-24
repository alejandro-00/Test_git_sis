package javaapplication5;
import javax.swing.*;

public class JavaApplication5 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"N° de registros a ingresar"));
        Alumno a[]=new Alumno[n];
        int q=n;
        boolean flag=false;
        String s="";
        for (int i = 0; i < n; i++) {
            int c=0;
            s=JOptionPane.showInputDialog("Quedan "+q+" registros por ingresar ", "Nombre");
            while (a[c]!=null&&!a[c].getNombre().equalsIgnoreCase(s)) {
                c++;
            }
            if (a[c]!=null&&a[c].getNombre().equalsIgnoreCase(s)) {
                a[c].setContador(a[c].getContador()+1);
                flag=true;
            }
            if (flag==false) {
                a[c]=new Alumno(s);
            }
        }
        int c=0;
        while (a[c]!=null) {
            System.out.println(a[c].toString());
            c++;
        }
    }
    
}
