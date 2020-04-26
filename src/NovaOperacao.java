import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NovaOperacao {
	public void ler(Operacao xml,String args){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		Document doc;
		NodeList TagPai;
		Node TagFilho;
		Element Elemento;
		
		//Tipo Viagem
		xml.TipoViagem = "Padrao";
		
		//Hash Integrador;
		xml.Hash = "";
		
		//Versao para Adicionar Operacao de Transporte
		xml.Versao = 7;
		
		xml.EmissaoGratuita = true;
		
		xml.BloquearNaoEquiparado = false;
		
		
		try{
			builder = factory.newDocumentBuilder();
			doc = builder.parse(args);
			
			//Tag Emissor
			TagPai = doc.getElementsByTagName("emit");
			//Tag CNPJ
			xml.MatrizCNPJ = TagPai.item(0).getChildNodes().item(1).getTextContent();
			
			//Tag Controle CTE
			TagPai = doc.getElementsByTagName("cct");
			xml.IdOperacaoCliente = TagPai.item(0).getChildNodes().item(0).getTextContent();
		
			//Data inicio
			TagPai = doc.getElementsByTagName("dhemi");
			xml.DataInicioViagem = TagPai.item(0).getChildNodes().item(0).getTextContent();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}
}
