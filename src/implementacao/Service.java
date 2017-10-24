package implementacao;

public abstract class Service<T extends Entidade> {

	private DAO<T> dao;

	public abstract DAO<T> getDao();
	
	//Servi�o geral a todos os servi�os que extenderem essa classe
	public void fazAlgumaCoisa(T entidade) {
		System.out.println("fez alguma coisa com a entidade " +entidade.getClass().getName() +" e com o objeto de id:" +entidade.getId());
	}
	
}
