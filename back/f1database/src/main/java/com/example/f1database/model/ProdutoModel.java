package com.example.f1database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ProdutoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String foto;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private VendedorModel vendedor;
	
	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private PedidoModel pedido;
	
}
