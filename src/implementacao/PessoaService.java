package implementacao;

public class PessoaService extends Service<Pessoa>{

	private DAO<Pessoa> pessoaDAO;
	
	@Override
	public DAO<Pessoa> getDao() {
		if(pessoaDAO == null) {
			pessoaDAO = new PessoaDAO();
		}
		
		return new PessoaDAO();
	}
	
	public void inserir(Pessoa pessoa) {
		//Simulando um excessão
		if(pessoa.getNome() == null) {
			System.out.println("Não é possível cadastrar uma pessoa sem nome!");
			return;
		}
		
		getDao().salvar(pessoa);
	}
	
	public void excluir(Pessoa pessoa) {
		//Simulando uma excessão
		if(pessoa.getId() == null) {
			System.out.println("Não é possível excluir uma pessoa sem ID!");
			return;
		}
		
		getDao().excluir(pessoa);
	}

}
