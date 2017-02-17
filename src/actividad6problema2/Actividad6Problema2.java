/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6problema2;
import java.util.Scanner;
/**
 *
 * @author danii 
 */
public class Actividad6Problema2 {

    /**
     * Johanna Daniela Macias Martinez
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,i,a=1;
        boolean flag=true;
        
        while(flag==true)
        {
        num =solicitardatos();
        if ((num<=10)&(num>=1))
        {
        for (i=1;i<=num;i++){
        a=a*i;}
        System.out.println("Número factorial: "+a);
        flag=false;
        }
        else{
                System.out.println("Debes teclear un valor entre 1 y 10");
                flag=true;
                }
        }
                
    }
    static int solicitardatos(){
        Scanner key = new Scanner (System.in);
        int num=0;
        boolean flag=true;
        while (flag==true){
        try{
        System.out.println("Ingresa un número entero: ");
        num=key.nextInt();
        flag=false;}
        catch(Exception e){
            System.out.println("No ingresaste un número entero");
            key.next();
            flag=true;
        }}
        return num;
    }
    
}
