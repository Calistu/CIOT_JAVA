
public class Operacao {
	
	public String TipoViagem;
	public String Hash;
	public int Versao;	//Criar operacao viagem = 7
	String Token;
	boolean EmissaoGratuita = true;
	boolean BloquearNaoEquiparado=true;
	
	String MatrizCNPJ;
	String FilialCNPJ;
	
	String IdOperacaoCliente;	//provavel codígo de controle no sistema
	String DataInicioViagem;
	String DataFimViagem;
	String CodigoNCMNaturezaCarga;	//Código NCM da mercadoria, no caso de mais que um, utilizar o de maior valor
	String PesoCarga;	//peso total em quilos
	String TipoEmbalagem; //deve ser usado itens da ENUM
	String CIOT;
	
	Viagens viagem;
	Impostos imposto;
	Pagamentos pagamento;
	
	Contratante contratante;
	Contratado contratado;
	SubContratante subcontratante;
	Consignatario consignatario;
	TomadorServico tomadorServico;
	Veiculos veiculo;
	
	String ObservacoesAoTransportador;
	String ObservacoesAoCredenciado;
	String EntregaDocumentacao;
	
	int QuantidadeSaques;
	int QuantidadeTransferencias;
	int CodigoTipoCarga;
	
	boolean AltoDesempenho;
	boolean DestinacaoComercial;
	boolean FreteRetorno;
	boolean CepRetorno;
	
	float DistanciaRetorno;
	int Pagamento; // -Transferencia Bancaria / -eFRETE / -Outros 
	
	public Operacao() {
		Viagens viagem = new Viagens();
		Impostos imposto = new Impostos();
		Pagamentos pagamento = new Pagamentos();
		
		Contratante contratante = new Contratante();
		Contratado contratado = new Contratado();
		SubContratante subcontratante = new SubContratante();
		Consignatario consignatario = new Consignatario();
		TomadorServico tomadorServico = new TomadorServico();
		Veiculos veiculo = new Veiculos();		
	}
	public void getFreteRetorno(){
		
	}
}
