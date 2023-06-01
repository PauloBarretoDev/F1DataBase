package com.example.f1database.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {
	private Long id;
	private String nome;
	private String email;
	private int telefone;
	private Long endereco_id;
}