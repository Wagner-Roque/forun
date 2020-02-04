package br.com.qintess.mapstruct.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoRequest {
	
	private String rua;
	private Integer numero;
	private String cidade;
}
