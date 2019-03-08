import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LerArquivo {
	
	static List<Palavra> lista = new ArrayList<Palavra>();

	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("arquivo.txt");
		Scanner fileScanner = new Scanner(file);
		int lineCount = 0;
		int wordCount = 0;
		while (fileScanner.hasNextLine()) {
		   String line = fileScanner.nextLine();
		   System.out.print(++lineCount);
		   System.out.println(". "+line);
		   
//		   String[] palavras  = line.split(" ");
//		   for(int i = 0 ; i < palavras.length; i++ ) {
//			   String palavra = palavras[i];
// 			   wordCount++;
//		   }
		   for(String palavra : line.split(" ")){
			   Palavra p = new Palavra(palavra);
			   if( lista.contains(p)) {
				   int i = lista.indexOf(p);
				   Palavra atual = lista.get(i);
				   int valor = atual.getQuantidade()+1;
				   atual.setQuantidade(valor);
			   }else {
				   p.setQuantidade(1);
				   lista.add(p);
			   }
		   }
		   // Processar o conteúdo do arquivo ..
		}
		
		for (Palavra string : lista) {
			System.out.println("Palavra: "+string.getPalavra()+" QTD: "+string.getQuantidade());
		}
		
		System.out.println(lista.size());

	}
	
	
}


