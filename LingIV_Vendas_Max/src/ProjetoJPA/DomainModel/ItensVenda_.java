package ProjetoJPA.DomainModel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-03-20T04:33:05.774-0300")
@StaticMetamodel(ItensVenda.class)
public class ItensVenda_ {
	public static volatile SingularAttribute<ItensVenda, Integer> Codigo;
	public static volatile SingularAttribute<ItensVenda, Produto> Produto;
	public static volatile SingularAttribute<ItensVenda, Vendas> Venda;
	public static volatile SingularAttribute<ItensVenda, Float> Quantidade;
}
