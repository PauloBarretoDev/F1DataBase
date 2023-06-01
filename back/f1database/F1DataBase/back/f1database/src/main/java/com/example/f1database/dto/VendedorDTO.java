package com.example.f1database.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VendedorDTO{
	private Long id;
	private String nome;
	private String email;
	private double salario;
	private int quantidadeVendas;
}