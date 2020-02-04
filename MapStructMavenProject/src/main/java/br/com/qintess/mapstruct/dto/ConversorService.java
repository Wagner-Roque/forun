package br.com.qintess.mapstruct.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversorService {
	
	@Autowired
	private PessoaMapper pessoaMapper;
	
	public PessoaResponse converte(final PessoaRequest pessoaRequest) {
		return pessoaMapper.de(pessoaRequest);
	}
	
}
