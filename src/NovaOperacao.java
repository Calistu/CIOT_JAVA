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
		NodeList FilhosList;
		
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
			
			//Tag CNPJ
			System.out.println("Lendo emit");
			TagPai = doc.getElementsByTagName("emit");
			FilhosList = TagPai.item(0).getChildNodes();
			for(int cont =0;cont<FilhosList.getLength();cont++)
			{
				if(FilhosList.item(cont).getNodeName()=="CNPJ")			
					xml.MatrizCNPJ = FilhosList.item(cont).getTextContent();
			}
			
			//Tag Controle CTE
			System.out.println("Lendo cCT");
			TagPai = doc.getElementsByTagName("cCT");
			FilhosList = TagPai.item(0).getChildNodes();
			xml.IdOperacaoCliente = FilhosList.item(0).getTextContent();
			
			//Tag Datainicio
			System.out.println("Lendo dhEmi");
			TagPai = doc.getElementsByTagName("dhEmi");
			FilhosList = TagPai.item(0).getChildNodes();
			xml.DataInicioViagem = FilhosList.item(0).getTextContent();
				
			//Tag DataFim
			System.out.println("Lendo dPrev");
			TagPai = doc.getElementsByTagName("dPrev");
			FilhosList = TagPai.item(0).getChildNodes();
			xml.DataFimViagem = FilhosList.item(0).getTextContent();
		
			//Tags Viagens
			System.out.println("Lendo nCT");
			TagPai = doc.getElementsByTagName("nCT");
			FilhosList = TagPai.item(0).getChildNodes();
			xml.viagem.DocumentoViagem = FilhosList.item(0).getTextContent();
			
			System.out.println("Lendo cMunIni");
			TagPai = doc.getElementsByTagName("cMunIni");
			FilhosList = TagPai.item(0).getChildNodes();
			xml.viagem.CodigoMunicipioOrigem = Long.parseLong(FilhosList.item(0).getTextContent());
			
			System.out.println("Lendo cMunFim");
			TagPai = doc.getElementsByTagName("cMunFim");
			FilhosList = TagPai.item(0).getChildNodes();
			xml.viagem.CodigoMunicipioDestino = Long.parseLong(FilhosList.item(0).getTextContent());
			
			System.out.println("Lendo enderReme");
			TagPai = doc.getElementsByTagName("enderReme");
			FilhosList = TagPai.item(0).getChildNodes();
			for(int cont =0;cont<FilhosList.getLength();cont++)
			{
				if(FilhosList.item(cont).getNodeName()=="cMun")
				{
					xml.viagem.CodigoMunicipioOrigem = Long.parseLong(FilhosList.item(cont).getTextContent());
				}
				if(FilhosList.item(cont).getNodeName()=="CEP")
				{
					xml.viagem.CepOrigem = FilhosList.item(cont).getTextContent(); 
				}
			}	
			
			TagPai = doc.getElementsByTagName("enderDest");
			FilhosList = TagPai.item(0).getChildNodes();
			for(int cont =0;cont<FilhosList.getLength();cont++)
			{
				if(FilhosList.item(cont).getNodeName()=="cMun")
				{
					xml.viagem.CodigoMunicipioDestino =Long.parseLong(FilhosList.item(cont).getTextContent());
				}
				if(FilhosList.item(cont).getNodeName()=="CEP")
				{
					xml.viagem.CepDestino = FilhosList.item(cont).getTextContent(); 
				}
			}
			TagPai = doc.getElementsByTagName("vPrest");
			FilhosList = TagPai.item(0).getChildNodes();
			for(int cont =0;cont<FilhosList.getLength();cont++)
			{
				if(FilhosList.item(cont).getNodeName()=="vTPrest")
					xml.viagem.valores.TotalOperacao = Float.parseFloat(FilhosList.item(cont).getTextContent());
			}
		}
		catch(Exception e) {
			System.out.println("Lendo XML:");
			System.out.println(e.toString());
		}
		
		
		
	}
}
