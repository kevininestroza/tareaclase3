
public class Ejercicios
{
	// en estos ejercicios ingeniero declaramos con un a condicion int y con el return nos tirara el resultado de lo que declaramos con int 
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	
	{
		int resultado = x+y;
		return resultado;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int resultado = x-y;
		return resultado;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int resultado = x*y;
		return resultado;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int resultado = x%y;
		return resultado;
	}
	// con esta colocamos la condicion if para ver si se cumple o no la condicion y nos tirara verdadero o falso
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		if(x % 2 == 0)
		{
			return true;
		}
		return false;
	}
	//lo mismo que el anterior 
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	
	{
		if(x % 3 == 0)
		{
			return true;
		}
		
		return false;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		if (x>y)
		{
			return x;
		}else if (y>x)
		{
		
		return y;
		}
	}

	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		if (edad>=18)
		{
			return true;
		}
		return false;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		if((x % 2 ==0)&&( y % 2 == 0)&& (z % 2 == 0))
		{
			return true;
		}
		return false;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if((x>y)&&(x>z))
		{
			return x;
		
		}else if ((y>x)&&(y>z))
		{
			return y;
		}if((z>x)&&(z>y))
		{
			
		}
		
			return z;
		}
		
	
	
	public static void main(String[] args)
	{
		
	}

}
//muchas gracias ingeniero por lo aprendido
