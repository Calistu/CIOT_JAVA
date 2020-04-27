import java.io.FileOutputStream;

import org.json.simple.JSONObject;

public class CriarJSON {
	@SuppressWarnings("unchecked")
	public void escrever(Operacao xml) {
		JSONObject Operacao = new JSONObject();
		JSONObject Viagem = new JSONObject();
		JSONObject Valores = new JSONObject();
		JSONObject Impostos = new JSONObject();
		JSONObject Pagamentos = new JSONObject();
		
		Operacao.put("TipoViagem",xml.TipoViagem);
		Operacao.put("Integrador", xml.Hash);
		Operacao.put("Versao", xml.Versao);
		Operacao.put("Token", xml.Token);
		Operacao.put("BloquearNaoEquiparado", xml.BloquearNaoEquiparado);
		Operacao.put("MatrizCNPJ", xml.MatrizCNPJ);
		Operacao.put("IdOperacaoCliente", xml.IdOperacaoCliente);
		
		Impostos.put("IRRF",xml.imposto.IRRF);
		Impostos.put("SestSenat",xml.imposto.SestSenat);
		Impostos.put("INSS",xml.imposto.INSS);
		Impostos.put("ISSQN",xml.imposto.ISSQN);
		Impostos.put("OutrosImpostos",xml.imposto.OutrosImpostos);
		Impostos.put("DescricaoOutrosImpostos",xml.imposto.DescricaoOutrosImpostos);
		Impostos.put("ISSQN",xml.imposto.ISSQN);
		Impostos.put("ISSQN",xml.imposto.ISSQN);
		Impostos.put("ISSQN",xml.imposto.ISSQN);
		
		Pagamentos.put("IdPagamentoCliente", xml.pagamento.IdPagamentoCliente);
		Pagamentos.put("DataDeLiberacao", xml.pagamento.DataDeLiberacao);
		Pagamentos.put("Valor", xml.pagamento.Valor);
		Pagamentos.put("Categoria", xml.pagamento.Categoria);
		Pagamentos.put("Documento", xml.pagamento.Documento);
		
		Viagem.put("CepOrigem",xml.viagem.CepOrigem);
		Viagem.put("CepDestino",xml.viagem.CepDestino);
		Viagem.put("CodigoMunicipioOrigem",xml.viagem.CodigoMunicipioOrigem);
		Viagem.put("CodigoMunicipioDestino",xml.viagem.CodigoMunicipioDestino);
		
		Valores.put("TotalViagem", xml.viagem.valores.TotalViagem);
		Valores.put("TotalDeAdiantamento", xml.viagem.valores.TotalDeAdiantamento);
		Valores.put("TotalOperacao", xml.viagem.valores.TotalOperacao);
		Valores.put("TotalDeQuitacao", xml.viagem.valores.TotalDeQuitacao);
		Valores.put("Combustivel", xml.viagem.valores.Combustivel);
		Valores.put("Pedagio", xml.viagem.valores.Pedagio);
		Valores.put("OutrosCreditos", xml.viagem.valores.OutrosCreditos);
		Valores.put("JustificativaOutrosCreditos", xml.viagem.valores.JustificativaOutrosCreditos);
		Valores.put("Seguro", xml.viagem.valores.Seguro);
		Valores.put("OutrosDebitos", xml.viagem.valores.OutrosDebitos);
		Valores.put("JustificativaOutrosDebitos", xml.viagem.valores.JustificativaOutrosDebitos);
		
		Viagem.put("Valores",Valores);
		
		Operacao.put("Pagamentos", Pagamentos);
		Operacao.put("Impostos", Impostos);
		Operacao.put("Viagens",Viagem);
		
		
		try {
			FileOutputStream jsonFile = new FileOutputStream("AdicionarOperacaoTransporteRequest"); 
			jsonFile.write(Operacao.toJSONString().getBytes());
			jsonFile.close();
		}	
		catch(Exception e) {
			System.out.println("Gerando json:");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			return ;
		}
	}
}
