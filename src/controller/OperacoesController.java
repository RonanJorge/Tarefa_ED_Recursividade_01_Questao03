package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public int digitos(int n) {
		/* O ponto de parada será quando o número tiver apenas um dígito, 
		 * ou seja, ele é maior que -10 e menor que 10. O retorno da função
		 * deve ser 1, pois o número tem apenas um dígito. */
		if(-10 < n && n < 10) {
			return 1;
		}
		else {
			/* Enquanto o número tiver mais de um dígito, ou seja, menor ou igual
			 * a -10 ou maior ou igual a 10, a função retornará quantos dígitos tem 
			 * o número dividido por 10, para eliminarmos o digito da unidade, 
			 * e somamos uma unidade que representa o dígito já eliminado.*/
			return 1 + digitos(n / 10);
		}
	}
}
