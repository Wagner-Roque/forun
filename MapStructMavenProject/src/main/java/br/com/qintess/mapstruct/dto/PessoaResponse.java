package br.com.qintess.mapstruct.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PessoaResponse {
	
	private String nome;
	private Integer idade;
	private List<EnderecoResponse>enderecos;
	
}