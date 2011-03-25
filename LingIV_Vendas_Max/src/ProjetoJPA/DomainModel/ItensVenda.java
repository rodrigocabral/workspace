package ProjetoJPA.DomainModel;

import javax.persistence.*;

@Entity
@Table(name="itensvenda")
public class ItensVenda {
	
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int Codigo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Produto")
	private Produto Produto;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Venda")
	private Vendas Venda;
	
	@Column
	private float Quantidade;
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public Produto getProduto() {
		return Produto;
	}
	public void setProduto(Produto produto) {
		Produto = produto;
	}
	public Vendas getVenda() {
		return Venda;
	}
	public void setVenda(Vendas venda) {
		Venda = venda;
	}
	public float getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(float quantidade) {
		Quantidade = quantidade;
	}
}
