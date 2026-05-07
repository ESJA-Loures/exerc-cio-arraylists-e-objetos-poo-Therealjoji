import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Pedro");
		  for (String nome : nomes) {
	            System.out.println(nome);
	        }
			System.out.println("-------"); // mantém esta linha, é só um separador
		  nomes.set(0,"João");
		  System.out.println(nomes.getFirst());		
		// Elimina o nome Maria
		  nomes.remove(1);
			System.out.println("-------"); // mantém esta linha, é só um separador
		  for (String nome : nomes) {
	            System.out.println(nome);
	        }
		System.out.println("-------"); // mantém esta linha, é só um separador
		
	}
}