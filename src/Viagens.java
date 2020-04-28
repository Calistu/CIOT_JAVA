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
	private int NotasFiscaisQnt;
	
	public Viagens(){
		valores = new Valores();
	}
	public int getNotasFiscaisQnt(){
		return this.NotasFiscaisQnt;
	}
	public void setNotasFiscaisQnt(int qnt){
		this.NotasFiscaisQnt = qnt;
	}
}
