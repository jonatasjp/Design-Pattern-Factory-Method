package implementacao;

import java.util.List;

public interface InterfaceDAO<T> {
	
	public void salvar(T entidade);
	
	public void excluir(T entidade);
	
	public T buscarPorId(Long id);
	
	public List<T> buscarTodos();
}
