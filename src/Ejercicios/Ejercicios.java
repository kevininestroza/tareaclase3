package Ejercicios;


public class Ejercicios
{
	//devuelve la suma de x y y
	// int es un numero y es el resultado de la suma de x+y
	static int sumar(int x, int y)
	
	{
		int resultado = x+y;
		return resultado;
	}
	
	//devuelve la resta de x y y
	//con la condicion int declaramos que es un numero y nos dara el resultado de la resta de x-y
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
	
	//devuelve true si x es par, de lo cotrario devuelve false
	//con la condicion if sabremos si x es par de lo contrario mostrara falso
	static boolean esPar(int x)
	{
		if(x % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	//con la condicion if la usamos para ver si la funcion se cumple en este caso seria si es multiplo de 3
	static boolean esMultiploDe3(int x)
	
	{
		if(x % 3 == 0)
		{
			return true;
		}
		
		return false;
	}
	
	//devuelve el numero mayor (x o y)
	//con la funcion if planteamos la condiciones para devolver el numero mayor y si se cumple la funcion.
	static int getMayor(int x,int y)
	{
		if (x>y)
		{
			return x;
		}else if (y>x)
		{
		
			return y;
		}
		return x;
	}

	
	//devuelve true si la edad es mayor o igual a 18
	//con la condicion if podemos demostrar que si la funcion se cumple mostrara verdadero de los contrario falso
	static boolean esMayorDeEdad(int edad)
	{
		if (edad>=18)
		{
			return true;
		}
		return false;
	}
	
	//devuelve true si x, y y z son pares
	//con esta funcion if si los tres numeros son pares nos mostrara verdadero de lo contrario mostrara falso
	static boolean sonPares(int x, int y, int z)
	{
		if((x % 2 ==0)&&( y % 2 == 0)&& (z % 2 == 0))
		{
			return true;
		}
		return false;
	}
	
	//devuelve el numero mayor entre x, y y z
	//estamos chequiando que x es mayor que los demas o y mayor que los demas o z mayor que los demas
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
