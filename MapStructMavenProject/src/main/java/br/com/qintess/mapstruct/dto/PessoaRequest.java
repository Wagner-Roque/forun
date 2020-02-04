package br.com.qintess.mapstruct.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaRequest {
	
	private String  nome;
	private Integer idade;
	private List<EnderecoRequest>endereco;
	
}
