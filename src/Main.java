public class Main {

	public static void main(String[] args) {	
		if(args.length<=0)
		{
			System.out.println("Digite o caminho do arquivo XML");
			return ;
		}
		Operacao xml = new Operacao();
		NovaOperacao leitura = new NovaOperacao();
		CriarJSON escrita = new CriarJSON();  
		
		xml.viagem.setNotasFiscaisQnt(2);
		leitura.ler(xml,args[0]);
		escrita.escrever(xml);
	}

}
