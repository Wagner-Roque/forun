package br.com.qintess.mapstruct.dto;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
		EnderecoMapper.class
})
public interface PessoaMapper {
		
	PessoaResponse de(final PessoaRequest pessoaRequest);
	
}
