package ProjetoJPA.DomainModel;

import javax.persistence.*;

@Entity
@Table(name="vendas")
public class Vendas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Codigo")
	private int codigo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Cliente")
	private Clientes cliente;
	
//	@Column(name="Data")
//	private Date data;
	
	@Column(name="ValorTotal")
	private float valortotal;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

//	public Date getData() {
//		return data;
//	}

//	public void setData(Date data) {
//		this.data = data;
//	}

	public float getValortotal() {
		return valortotal;
	}

	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}
	
}
