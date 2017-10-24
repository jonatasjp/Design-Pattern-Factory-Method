package implementacao;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO implements InterfaceDAO<Pessoa>{

	@Override
	public void salvar(Pessoa entidade) {
		System.out.println("inclusão da pessoa " +entidade.getNome());
	}

	@Override
	public void excluir(Pessoa entidade) {
		System.out.println("exclusão da pessoa" +entidade.getNome());
	}

	@Override
	public Pessoa buscarPorId(Long id) {
		return new Pessoa();
	}

	@Override
	public List<Pessoa> buscarTodos() {
		return new ArrayList<Pessoa>();
	}

}
