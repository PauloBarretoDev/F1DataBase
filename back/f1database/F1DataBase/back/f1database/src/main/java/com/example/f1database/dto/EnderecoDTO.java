package com.example.f1database.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnderecoDTO {
	private Long id;
	private String rua;
	private String numero;
	private String cidade;
	private String cep;
}