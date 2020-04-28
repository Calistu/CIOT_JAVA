
public class Terceiros {
	String NomeOuRazaoSocial;
	String CpfOuCnpj;
	Endereco ContEndereco;
	Telefones Celular;
	Telefones Fax;
	Telefones Fixo;
	String Email;
	boolean ResponsavelPeloPagamento;
	public Terceiros() {
		ContEndereco = new Endereco();
		Celular = new Telefones();
		Fax = new Telefones();
		Fixo = new Telefones();
	}
}
