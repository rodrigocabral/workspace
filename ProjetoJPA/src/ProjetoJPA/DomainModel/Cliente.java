
package ProjetoJPA.DomainModel;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private int id;
	
	@Column
	private String nome;
	
	@OneToMany(orphanRemoval=true, cascade={CascadeType.ALL},mappedBy="cliente")
	private List<Telefone> telefones;
	
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
	
	public void addTelefone(String numero){
		if(this.telefones==null) this.telefones = new LinkedList<Telefone>();
		
		Telefone tmp = new Telefone();
		tmp.setNumero(numero);
		tmp.setCliente(this);
		
		if(this.telefones.add(tmp))
			System.out.println("Inseriu");
	}

}
