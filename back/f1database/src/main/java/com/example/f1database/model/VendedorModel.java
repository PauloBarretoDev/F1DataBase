package com.example.f1database.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VendedorModel extends UsuarioModel {
	private double salario;
	private int quantidadeVendas;
	
	@OneToMany(mappedBy = "vendedor")
	private List<ProdutoModel> produtos;
	
}
