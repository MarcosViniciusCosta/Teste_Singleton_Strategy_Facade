package padroes_de_projeto.singleton.teste;

import padroes_de_projeto.singleton.Calculadora;

public class Main 
{
	public static void main(String[] args)
	{
		Calculadora calculadora =  Calculadora.getInstancia();
		System.out.println(calculadora.somar(15, 6.9));
		System.out.println("Endereço da instância: " + calculadora);
		Calculadora calculadora2 =  Calculadora.getInstancia();
		System.out.println(calculadora2.subtrair(15, 68));
		System.out.println("Endereço da instância: " + calculadora2);
	}
}
