package Vendas.DomainModel;

import javax.persistence.*;

@Entity
@Table(name="itensvenda")
public class ItensVenda {
	
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int Codigo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Produtos_Codigo")
	private Produto Produto;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Vendas_Codigo")
	private Venda venda;
	
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
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public float getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(float quantidade) {
		Quantidade = quantidade;
	}
}