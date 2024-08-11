/*3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior
*/
package controller;

public class ControllerFatorial {

	public ControllerFatorial() {
		super();
	}
	
	public int fatorial(int numero) {
		if(numero == 1) {
			return 1; //O fatorial acaba quando o numero chegar a 1, retornando 1 para a multiplicação.
		} else {
			return numero * fatorial(numero - 1);//Enquanto numero for maior que 1, retorna a multiplicacao de numero com a recursiva.
		}
	}
}
