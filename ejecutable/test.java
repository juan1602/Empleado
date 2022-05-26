package ejecutable;

import modelo.Empresa;

public class test 
{
    
    public static void main (String[] args)
    {
        // crear un carro rojo en la posicion 0,0.mostrar la informacion del carro creado. 
        Empresa miEmpleado = new Empresa(1980, 2010, 500);

        // mostrar la informacion del carro creado. 
        System.out.println("informacion del empleado: \n La edad del empleado es: " + miEmpleado.edadEmpleado() + "\nEl tiempo que lleva el empleado trabajando con nostros es: " + miEmpleado.edadTrabajando());

    }
}
