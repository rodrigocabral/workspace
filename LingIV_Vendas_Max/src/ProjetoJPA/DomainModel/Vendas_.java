package ProjetoJPA.DomainModel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-03-21T01:01:28.488-0300")
@StaticMetamodel(Vendas.class)
public class Vendas_ {
	public static volatile SingularAttribute<Vendas, Integer> codigo;
	public static volatile SingularAttribute<Vendas, Clientes> cliente;
	public static volatile SingularAttribute<Vendas, Float> valortotal;
}
