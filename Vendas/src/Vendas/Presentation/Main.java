package Vendas.Presentation;

import Vendas.DataAccess.ClienteRepository;
import Vendas.DataAccess.ProdutoRepository;
import Vendas.DataAccess.VendasRepository;
import Vendas.DomainModel.Venda;


public class Main {

	public static void main(String[] args) throws Exception {		
		
		
		
		Venda v = new Venda();
		VendasRepository vr = new VendasRepository();
		ProdutoRepository pr = new ProdutoRepository();
		ClienteRepository cr = new ClienteRepository();
		
			
			v.setCliente(cr.Open(2));
			v.addItem(pr.Open(5) , 2);
			v.addItem(pr.Open(6), 2);
			
			vr.Save(v);
			
		
	
		
		System.out.println("Pronto");
		
	}

}
