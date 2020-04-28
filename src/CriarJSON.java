import java.io.FileOutputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CriarJSON {
	@SuppressWarnings({ "unchecked" })
	public void escrever(Operacao xml) {
		JSONObject Operacao = new JSONObject();
		JSONObject Viagem = new JSONObject();
		JSONObject Valores = new JSONObject();
		JSONObject Impostos = new JSONObject();
		JSONArray NotasFiscais = new JSONArray();
		JSONObject InformacoesBancarias = new JSONObject();
		JSONObject Pagamentos = new JSONObject();
		JSONObject Tolerancia = new JSONObject();
		JSONObject DiferencaDeFrete = new JSONObject();
		JSONObject ToleranciaDePerdaDeMercadoria = new JSONObject();
		JSONObject MargemGanho = new JSONObject();
		JSONObject MargemPerda = new JSONObject();
		JSONObject Contratado = new JSONObject();
		JSONObject Motorista = new JSONObject();
		JSONObject Destinatario = new JSONObject();
		JSONObject Celular = new JSONObject();
		JSONObject Contratante = new JSONObject();
		JSONObject Subcontratante = new JSONObject();
		JSONObject Consignatario = new JSONObject();
		JSONObject TomadorServico = new JSONObject();
		JSONObject Veiculos = new JSONObject();
		
		
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
		
		InformacoesBancarias.put("InstituicaoBancaria", "");
		InformacoesBancarias.put("Agencia", "");
		InformacoesBancarias.put("Conta", "");
		InformacoesBancarias.put("TipoConta", "");
		InformacoesBancarias.put("InformacaoAdicional","");
		InformacoesBancarias.put("CnpjFilialAbastecimento","");
		
		Pagamentos.put("IdPagamentoCliente", xml.pagamento.IdPagamentoCliente);
		Pagamentos.put("DataDeLiberacao", xml.pagamento.DataDeLiberacao);
		Pagamentos.put("Valor", xml.pagamento.Valor);
		Pagamentos.put("Categoria", xml.pagamento.Categoria);
		Pagamentos.put("Documento", xml.pagamento.Documento);
		Pagamentos.put("InformacoesBancarias",InformacoesBancarias);
		
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
			
		JSONObject NotaFiscal = new JSONObject();
		
		for(int cont=0;cont<=xml.viagem.getNotasFiscaisQnt();cont++) { 
			NotaFiscal.put("Numero","");
			NotaFiscal.put("Serie","");
			NotaFiscal.put("Data","");
			NotaFiscal.put("ValorTotal","");
			NotaFiscal.put("ValorDaMercadoriaPorUnidade","");
			NotaFiscal.put("DescricaoDaMercadoria","");
			NotaFiscal.put("UnidadeDeMedidaDaMercadoria","");
			NotaFiscal.put("TipoDeCalculo","");
			NotaFiscal.put("ValorDoFretePorUnidadeDeMercadoria","");
			NotaFiscal.put("QuantidadeDaMercadoriaNoEmbarque","");
			NotaFiscal.put("CodigoNCMNaturezaCarga","");
			
			ToleranciaDePerdaDeMercadoria.put("Tipo","");
			ToleranciaDePerdaDeMercadoria.put("Valor","");
			
			DiferencaDeFrete.put("Tipo","");
			DiferencaDeFrete.put("Base","");

			Tolerancia.put("Tipo","");
			Tolerancia.put("Valor","");
			
			MargemGanho.put("Tipo", "");
			MargemGanho.put("Valor", "");
			
			MargemPerda.put("Tipo", "");
			MargemPerda.put("Valor", "");

			NotaFiscal.put("ToleranciaDePerdaDeMercadoria",ToleranciaDePerdaDeMercadoria);
			NotaFiscal.put("DiferencaDeFrete",DiferencaDeFrete);
			NotaFiscal.put("Tolerancia",Tolerancia);
			NotaFiscal.put("MargemGanho",Tolerancia);
			NotaFiscal.put("MargemPerda",Tolerancia);		
			
			NotasFiscais.add(cont,NotaFiscal);
		}
		
		
		Viagem.put("NotasFiscais",NotasFiscais);
		
		
		Viagem.put("Valores",Valores);
		
		
		Contratado.put("CpfOuCnpj", xml.contratado.CpfOuCnpj);
		Contratado.put("RNTRC", xml.contratado.RNTRC);
		
		Celular.put("DDD", xml.motorista.Celular.DDD);
		Celular.put("Numero", xml.motorista.Celular.Numero);
		Motorista.put("CpfOuCnpj", xml.motorista.CpfOuCnpj);
		Motorista.put("CNH", xml.motorista.CNH);
		Motorista.put("Celular", Celular);

		Celular.put("DDD", xml.motorista.Celular.DDD);
		Celular.put("Numero", xml.motorista.Celular.Numero);
		Destinatario.put("NomeOuRazaoSocial",xml.destinatario.NomeOuRazaoSocial);
		Destinatario.put("CpfOuCnpj", xml.destinatario.CpfOuCnpj);
		Destinatario.put("Celular", Celular);
		
		
		Operacao.put("Contratado", Contratado);
		Operacao.put("Motorista", Motorista);
		Operacao.put("Pagamentos", Destinatario);
		Operacao.put("Contratante", Subcontratante);
		Operacao.put("Consignatario", Consignatario);
		Operacao.put("TomadorServico", TomadorServico);
		Operacao.put("Veiculos", Veiculos);
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
