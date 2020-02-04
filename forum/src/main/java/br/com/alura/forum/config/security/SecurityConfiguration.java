package br.com.alura.forum.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.alura.forum.repository.UsuarioRepository;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AutenticacaoService autenticacaoService;
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	@Override//Configuração de autenticação
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Aqui ensinamos ao Spring o como ele vai autenticar o usuário com o Banco
		auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override//Configurações de autorizações
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/topicos").permitAll()//Permite o acesso para o end point no parâmetro
		.antMatchers(HttpMethod.GET, "/topicos/*").permitAll()//Permite o acesso para o end point no parâmetro e qualquer complemento
		.antMatchers(HttpMethod.POST, "/auth").permitAll()//Toda nova url precisa dar permissão, url de login
		.antMatchers(HttpMethod.GET, "/actuator/**").permitAll()
		.anyRequest().authenticated() //qualquer outra requisição terá que está autenticada
		.and().csrf().disable()//Csrf é uma abreviação para cross-site request forgery, que é um tipo de ataque hacker que acontece em aplicações web.
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)//Politica de criação de sessão
		.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, usuarioRepository), UsernamePasswordAuthenticationFilter.class);//qual filtro vem antes
		//.and().formLogin();//gera um formulário de login do próprio Spring e cria sessão
	}
	
	@Override//Configurações de recursos estatícos(req para CSS, JS, IMGs e etc...)
	public void configure(WebSecurity web) throws Exception {
		 web.ignoring()
	        .antMatchers("/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**", "/swagger-resources/**");
	}
	
}
