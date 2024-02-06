package br.com.calleb.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_CLIENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
	@SequenceGenerator(name = "cliente_seq", sequenceName = "sq_cliente", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;

	@Column(name = "CPF", nullable = false, unique = true)
	private Long cpf;

	@Column(name = "TEL", nullable = false)
	private Long tel;

	@Column(name = "EMAIL", nullable = false, length = 50)
	private String email;

	@Column(name = "ENDERECO", nullable = false, length = 100)
	private String end;

	@Column(name = "NUMERO", nullable = false)
	private Integer numero;

	@Column(name = "CIDADE", nullable = false, length = 100)
	private String cidade;

	@Column(name = "ESTADO", nullable = false, length = 50)
	private String estado;

	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}

	public static class ClienteBuilder {
		private Long id;
		private String nome;
		private Long cpf;
		private Long tel;
		private String email;
		private String end;
		private Integer numero;
		private String cidade;
		private String estado;

		public ClienteBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public ClienteBuilder cpf(Long cpf) {
			this.cpf = cpf;
			return this;
		}

		public ClienteBuilder tel(Long tel) {
			this.tel = tel;
			return this;
		}

		public ClienteBuilder email(String email) {
			this.email = email;
			return this;
		}

		public ClienteBuilder end(String end) {
			this.end = end;
			return this;
		}

		public ClienteBuilder numero(Integer numero) {
			this.numero = numero;
			return this;
		}

		public ClienteBuilder cidade(String cidade) {
			this.cidade = cidade;
			return this;
		}

		public ClienteBuilder estado(String estado) {
			this.estado = estado;
			return this;
		}

		public Cliente build() {
			return new Cliente(id, nome, cpf, tel, email, end, numero, cidade, estado);
		}
	}

	private Cliente(Long id, String nome, Long cpf, Long tel, String email, String end, Integer numero, String cidade,
			String estado) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.email = email;
		this.end = end;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}
}
