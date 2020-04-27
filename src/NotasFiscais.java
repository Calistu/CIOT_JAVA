import java.util.Date;

public class NotasFiscais {
	//Raiz NotasFiscais 1-N
	
	long NotaFiscal;
	long Numero;
	int serie;
	Date Data;
	float ValorTotal;
	float ValorDaMercadoriaPorUnidade;
	long CodigoNCMNaturezaCargaNF;
	String UnidadeDeMedidaDaMercadoria;
	String DescricaoDaMercadoria;
	String TipoDeCalculo;
	float ValorDoFretePorUnidadeDeMercadoria;
	int QuantidadeDaMercadoriaNoEmbarque;
	String DiferencaDeFreteTipo;
	String DiferencaDeFreteBase;
	ToleranciaMargens PerdadeMercadoria;
	ToleranciaMargens Tolerancia;
	ToleranciaMargens Ganho;
	ToleranciaMargens Perda;
	
	public NotasFiscais (){
		ToleranciaMargens PerdadeMercadoria = new ToleranciaMargens();
		ToleranciaMargens Tolerancia = new ToleranciaMargens();
		ToleranciaMargens Ganho = new ToleranciaMargens();
		ToleranciaMargens Perda = new ToleranciaMargens();
	}
	
}
