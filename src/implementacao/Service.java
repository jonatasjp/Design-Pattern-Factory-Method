package implementacao;

import java.util.List;

public abstract class Service<T extends Entidade> {

	public abstract InterfaceDAO<T> getDao();
	
	//Serviço geral a todos os serviços que extenderem essa classe
	public void fazAlgumaCoisa(T entidade) {
		System.out.println("fez alguma coisa com a entidade " +entidade.getClass().getName() +" e com o objeto de id:" +entidade.getId());
	}
	
	//Uso do hook method para objeter a instancia do DAO declarado na subclasse desse servico
	public List<T> buscarTodos() {
		return getDao().buscarTodos();
	}
	
}
