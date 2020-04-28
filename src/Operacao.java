
public class Operacao {
	
	public String TipoViagem;
	public String Hash;
	public int Versao;	//Criar operacao viagem = 7
	String Token;
	boolean EmissaoGratuita = true;
	boolean BloquearNaoEquiparado=true;
	
	String MatrizCNPJ;
	String FilialCNPJ;
	
	String IdOperacaoCliente;	//provavelmente é referente ao codígo de controle no sistema
	String DataInicioViagem;
	String DataFimViagem;
	String CodigoNCMNaturezaCarga;	//Código NCM da mercadoria, no caso de mais que um, utilizar o de maior valor comercial
	String PesoCarga;	//peso total em quilos
	String TipoEmbalagem; //deve ser usado itens da ENUM
	String CIOT;
	
	Viagens viagem;
	Impostos imposto;
	Pagamentos pagamento;
	
	Motorista motorista;
	Contratante contratante;
	Contratado contratado;
	Destinatario destinatario;
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
		
		viagem = new Viagens();
		imposto = new Impostos();
		pagamento = new Pagamentos();
		contratante = new Contratante();
		contratado = new Contratado();
		subcontratante = new SubContratante();
		consignatario = new Consignatario();
		tomadorServico = new TomadorServico();
		veiculo = new Veiculos();		
		motorista = new Motorista();
		destinatario = new Destinatario();
	}
	public void getFreteRetorno(){
		
	}
}
