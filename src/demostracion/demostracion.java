package demostracion;

public class demostracion 
{
	public static void main(String args[]) 
	{
		int Num1 = 1;
	    int Num2 = 2;
	    int NumCiclos = 10;
	    int ResultadoSuma = 0;
	    System.out.println(Num1);
	    System.out.println(Num2);
	    int x = 1;
	    do
	    {
	        ResultadoSuma = Num1 + Num2;
	        System.out.println(ResultadoSuma);
	        Num1=Num2;
	        Num2=ResultadoSuma;
	        x++;
	    }
	    while (x < NumCiclos);
	}
}
