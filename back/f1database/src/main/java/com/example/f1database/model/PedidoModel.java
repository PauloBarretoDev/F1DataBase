package com.example.f1database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PedidoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private ClienteModel cliente;
	
	@OneToMany(mappedBy = "pedido")
	private List<ProdutoModel> produtos;
	
	
}
