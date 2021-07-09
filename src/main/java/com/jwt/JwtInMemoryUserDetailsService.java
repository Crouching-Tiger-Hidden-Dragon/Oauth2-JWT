package com.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

	static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

	static {
		//		bcrypt https://bcrypt-generator.com/  round:12
		//pwd:12345
		inMemoryUserList.add(new JwtUserDetails(1L, "john",
				"$2y$12$RS7U7BHQqJ7z4vqjdaBLRuAzHIGOdALhT0dN2giAzQIQDbE7XIb2i", "ROLE_USER_2"));
		//pwd: 123456
		inMemoryUserList.add(new JwtUserDetails(2L, "emily",
				"$2y$12$Vh4zaYR2sWq/VN6ca7fcb.uqOt7hYLRVUuTbjivefrWLoiikII4tq", "ROLE_USER_2"));
		//pwd: huan
		inMemoryUserList.add(new JwtUserDetails(2L, "david",
				"$2y$12$2WqcG4H.I15RsBECliCg9eNhQjXg8dvdokE3GmIn54pBFgHtz/zPi", "ROLE_USER_2"));

		

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
				.filter(user -> user.getUsername().equals(username)).findFirst();

		if (!findFirst.isPresent()) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}

		return findFirst.get();
	}

}
