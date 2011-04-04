package Vendas.DomainModel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-04-04T09:49:31.662-0300")
@StaticMetamodel(ItensVenda.class)
public class ItensVenda_ {
	public static volatile SingularAttribute<ItensVenda, Integer> Codigo;
	public static volatile SingularAttribute<ItensVenda, Produto> Produto;
	public static volatile SingularAttribute<ItensVenda, Venda> venda;
	public static volatile SingularAttribute<ItensVenda, Float> Quantidade;
}
