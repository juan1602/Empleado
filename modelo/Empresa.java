package modelo;

public class Empresa 
{
    //--------------------------
    //Atributos
    //--------------------------
    private int sueldo=0;
    private static int auxilio = 117000;
    private int nacimiento;
    private int antiguedad;
    private int horas;
    private int tiempoEmpresa=0;
    private int edadEmpleado;
    public String getNacimiento;


    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    public Empresa(int pNacimiento, int pAntiguedad, int pHoras)
    {
        this.sueldo = 0;
        this.nacimiento = pNacimiento;
        this.antiguedad = pAntiguedad;
        this.horas = pHoras;
    }
    public static int getAuxilio()
    {
        return auxilio;
    }
    public int getHoras()
    {
        return this.horas;
    }
    public int getSueldo()
    {
        return this.sueldo;
    }
    public int getEdadEmpleado()
    {
        return this.edadEmpleado;
    }
    public int getAntiguedad()
    {
        return this.antiguedad;
    }
    public void setSueldo(int pSueldo)
    {
        this.sueldo= pSueldo;
    }
    public void setNacimiento(int pNacimiento)
    {
        this.nacimiento = pNacimiento;
    }
    public void setAntiguedad(int pAntiguedad)
    {
        this.antiguedad = pAntiguedad;
    }
    public void setHoras(int pHoras)
    {
        this.horas= pHoras;
    }
    public void salario(int pHoras)
    {
        sueldo= pHoras * 4000;
    }
    public void transporte()
    {
       if(sueldo<2000000)
       {
        sueldo= sueldo + auxilio;
       }
       else
       {
         setSueldo(sueldo);
       }

    }
    public int edadEmpleado()
    {
        
        edadEmpleado = 2022-nacimiento;
        return edadEmpleado;
    }
    public int edadTrabajando()
    {
        tiempoEmpresa= 2022-antiguedad;
        return tiempoEmpresa;
    }

}