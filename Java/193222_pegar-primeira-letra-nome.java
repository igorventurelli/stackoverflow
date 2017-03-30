//http://pt.stackoverflow.com/questions/193222/pegar-a-primeira-letra-do-nome-e-do-%C3%BAltimo-sobrenome

public class Teste {
	public static void main(String[] args) {
		String nome = "Carlos Eduardo Martins Dutra do Rego";
		String primeiraLetra = Character.toString(nome.charAt(0));
		int posicaoUltimoEspaco = nome.lastIndexOf(" ");
		String primeiraLetraUltimoNome = nome.substring(posicaoUltimoEspaco + 1, posicaoUltimoEspaco + 2);
		System.out.println(primeiraLetra + " " + primeiraLetraUltimoNome);
	}
}