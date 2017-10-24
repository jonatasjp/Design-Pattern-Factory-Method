package teste;

import implementacao.Pessoa;
import implementacao.PessoaService;

public class Main {
	
	public static void main(String[] args) {
		
		PessoaService pessoaService = new PessoaService();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(10L);
		
		pessoaService.inserir(pessoa);
		
		pessoaService.fazAlgumaCoisa(pessoa);
		
		System.out.println(pessoaService.buscarTodos());
	}
}
