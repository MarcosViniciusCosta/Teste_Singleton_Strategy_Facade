package padroes_de_projeto.singleton;

import java.util.Optional;

public class Calculadora 
{

	private static Calculadora calculadora;
	
	private Calculadora()
	{
		
	}
	
	public static Calculadora getInstancia()
	{
		if(calculadora == null)
		{
			calculadora = new Calculadora();
		}
		return calculadora;
	}
	
	public Double somar(double a, double b) 
	{
		return a+b;
	}

	public Double subtrair(double a, double b) 
	{
		return a-b;
	}

	public Optional<Double> dividir(double a, double b) 
	{
		if(b == 0.0)
		{
			return Optional.empty();
		}else
		{
			return Optional.of(a/b);
		}
	}

	public Double multiplicacao(double a, double b) 
	{
		return a-b;
	}
}
