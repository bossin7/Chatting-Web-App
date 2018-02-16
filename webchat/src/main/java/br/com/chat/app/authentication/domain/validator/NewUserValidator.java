package br.com.chat.app.authentication.domain.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.chat.app.authentication.domain.model.User;
import br.com.chat.app.authentication.domain.repository.UserRepository;

@Component
public class NewUserValidator implements Validator {

	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User newUser = (User) target;
		if (userRepository.exists(newUser.getUsername())) {
			errors.rejectValue("username", "new.account.username.already.exists");
		}
	}
}
