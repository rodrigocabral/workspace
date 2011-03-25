
package ProjetoJPA.DomainModel;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany
	@Column(name="Codigo")
	private int id;
	
	@Column
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