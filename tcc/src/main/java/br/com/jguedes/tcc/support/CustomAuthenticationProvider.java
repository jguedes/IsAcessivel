package br.com.jguedes.tcc.support;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.jguedes.tcc.model.User;
import br.com.jguedes.tcc.model.repository.IUserDAO;
import br.com.jguedes.tcc.util.UsersLogados;

@Named
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Inject
	private IUserDAO userDAO;

	public CustomAuthenticationProvider() {
		super();
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String login = authentication.getName();

		String password = authentication.getCredentials().toString();

		User user = this.userDAO.findByLoginAndPassword(login, password);

		if (user != null) {

			List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

			grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole()));

			user.setGrantedAuthorities(grantedAuthorities);

			UserDetails userDetails = user;

			UsersLogados.add(user);

			return new UsernamePasswordAuthenticationToken(userDetails, password, grantedAuthorities);

		}

		return null;

	}

	@Override
	public boolean supports(Class<?> authentication) {

		return authentication.equals(UsernamePasswordAuthenticationToken.class);

	}

}
