package TesteJPA.DomainModel;

import javax.persistence.*;

@Entity
@Table(name="Clientes")
public class Cliente {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Codigo")
	private int id;
	
	@Column(name="Nome")
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
