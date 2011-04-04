package Vendas.DomainModel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-04-04T09:49:31.691-0300")
@StaticMetamodel(Venda.class)
public class Venda_ {
	public static volatile SingularAttribute<Venda, Integer> id;
	public static volatile SingularAttribute<Venda, Float> ValorTotal;
	public static volatile SingularAttribute<Venda, String> Data;
	public static volatile SingularAttribute<Venda, Cliente> cliente;
	public static volatile ListAttribute<Venda, ItensVenda> itens;
}
