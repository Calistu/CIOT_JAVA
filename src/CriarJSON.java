import java.io.FileOutputStream;

import org.json.simple.JSONObject;

public class CriarJSON {
	public void escrever(Operacao xml) {
		JSONObject Operacao = new JSONObject();
		Operacao.put("TipoViagem",xml.TipoViagem);
		Operacao.put("Integrador", xml.Hash);
		Operacao.put("Versao", xml.Versao);
		Operacao.put("Token", xml.Token);
		Operacao.put("BloquearNaoEquiparado", xml.BloquearNaoEquiparado);
		Operacao.put("MatrizCNPJ", xml.MatrizCNPJ);
		Operacao.put("IdOperacaoCliente", xml.IdOperacaoCliente);
		
		try {
			FileOutputStream jsonFile = new FileOutputStream("AdicionarOperacaoTransporteRequest"); 
			jsonFile.write(Operacao.toJSONString().getBytes());
			jsonFile.close();
		}	
		catch(Exception e) {
			System.out.println(e.toString());
			return ;
		}
	}
}
