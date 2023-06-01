package com.example.f1database.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDTO {
	private Long id;
	private LocalDate data;
	private Long client_id;
}