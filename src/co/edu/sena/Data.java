package co.edu.sena;

public class Data
{
    public double calcularVolumenCilindro (double numero1,double numero2)
    {

        return ( Math.PI * (Math.pow(numero2,2))*numero1 );

    }


    public double calcularAreaTriangulo (double numero1,double numero2)
    {

        return ( numero1 * numero2 /2);

    }
    public double elevarNumeroAlCuadrado (double numero1)
    {

        return ( numero1 * numero1 );

    }
    public double sumarDosNumeros (double numero1,double numero2)
    {

        return ( numero1 + numero2 );

    }
    public double convertirADolares (double numero1)
    {

        return ( numero1 * 1.08 );

    }
    public double areaCuadrado (double numero1)
    {

        return ( numero1 * numero1 );

    }

    public double perimetroCuadrado (double numero1)
    {

        return ( numero1 * 4 );

    }

    public double calcularAreaCilindro (double numero1,double numero2)
    {

        return ( (2 * Math.PI *numero2 * numero1 ) + (2 * Math.PI*(Math.pow(numero2,2)) ));

    }



}
