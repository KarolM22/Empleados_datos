/*
 * 13.	Leer los siguientes datos de los empleados de una compañía:
Nombre, Sueldo, Departamento. Calcule lo siguiente:

a)	Cuántos empleados hay en cada departamento.
b)	Cuántos empleados ganan más de $ 8,000

Existen 5 departamentos: Finanzas, Sistemas, Producción, Ventas y Mantenimiento. 
Considere las claves necesarias.


 */
package empleados_datos;

import java.util.Scanner;

/**
 *
 * karol martinez cuellar
 */
public class Empleados_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String nombre, especialidad;
        int sueldo, f=0, sis=0, prod=0, ventas=0, mant=0;
        int n, x=1, cs=0; //x contador del while
        
        System.out.println(" DIGITE EL NUMERO DE EMPLEADOS: ");
        n=leer.nextInt();
        
        while(x<=n){
            System.out.println(" NOMBRE DEL EMPLEADO # "+x);
            nombre=leer.next();
            System.out.println(" DIGITE EL SUELDO");
            sueldo=leer.nextInt();
            
            if(sueldo>8000){
                cs++;
            }
            
            System.out.println(" DIGITE SU ESPECIALIDAD");
            especialidad=leer.next();
            
            if(("finanzas".equals(especialidad) )||("FINANZAS".equals(especialidad))){
               f++; 
            }else{if(("sistemas".equals(especialidad) )||("SISTEMAS".equals(especialidad))){
            sis++;
            }else{if(("produccion".equals(especialidad) )||("PRODUCCION".equals(especialidad))){
            prod++;
            }else{if(("ventas".equals(especialidad) )||("VENTAS".equals(especialidad))){
            ventas++;
            }else{if(("mantenimiento".equals(especialidad) )||("MANTENIMIENTO".equals(especialidad))){
            mant++;
                            }
                        }
                    }
                }
            }
        
     x++;   
    }
        System.out.println("--------------------------------------------------");
        System.out.println(" EN EL DEPARTAMENTO DE FINANZAS HAY "+f+" empleados");
        System.out.println(" EN EL DEPARTAMENTO DE SISTEMAS HAY "+sis+" empleados");
        System.out.println(" EN EL DEPARTAMENTO DE PRODUCCION HAY "+prod+" empleados");
        System.out.println(" EN EL DEPARTAMENTO DE VENTAS HAY "+ventas+" empleados");
        System.out.println(" EN EL DEPARTAMENTO DE MANTENIMIENTO HAY "+mant+" empleados");
        
        System.out.println("------------------------------------------------------------");
        System.out.println("HAY "+cs+" EMPLEADOS QUE GANAN MAS DE 8000");
    }
    
}
