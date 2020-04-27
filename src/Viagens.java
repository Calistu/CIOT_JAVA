public class Viagens {
	String DocumentoViagem; //CTE/serie , CTRC/serie , ordem de servico
	long CodigoMunicipioOrigem;
	long CodigoMunicipioDestino;
	String CepOrigem;
	String CepDestino;
	long DistanciaPercorrida;
	String TipoPagamento;
	NotasFiscais []NFe;
	Valores valores	;
	public Viagens(){
		valores = new Valores();
	}
}
