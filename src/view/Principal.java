/* Nome: Ronan Jorge
 * Data: 26/02/2023
 * Objetivo: 03) Crie uma função recursiva que exiba a quantidade de dígitos de um
 * número inteiro passado como parâmetro:
 */

package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;


public class Principal {
	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();	
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n: "));
		System.out.println("O número de dígitos de n é "+ op.digitos(n));
	}
}
