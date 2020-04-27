public class Logon {
	
	//Login entrada
	String Usuario; //email ou cpf cadastrado
	String Senha;   //senha cadastrada
	String Hash;    //hash integrador
	int Versao;        //versão = 1 para login e logout, 
	
	//Login retorno
	String Token;
	String ExcecaoMsg;
	boolean Sucesso;
		
}
