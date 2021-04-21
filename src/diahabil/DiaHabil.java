package diahabil;

import java.util.Scanner;
public class DiaHabil {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dia = 0;
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        System.out.println("Ingrese el numero de un día de la semana correspondiente a la siguiente lista");
        
        for(int i = 1; i < 8; i++){
            System.out.println(i + "- " +dias[i-1]);
        }
        dia = ent.nextInt();
        
        if(dia>0 && dia<8){
            if(dia>0 && dia<6){
               System.out.println(dias[dia-1] + " Es dia habil");
            }else{
                System.out.println(dias[dia-1] + " Es fin de semana");
            }
        }else{
            System.out.println("El numero no corresponde a un dia");
        }
        
        
    }
    
}
