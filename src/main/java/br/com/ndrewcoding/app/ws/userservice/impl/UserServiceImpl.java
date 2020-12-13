package br.com.ndrewcoding.app.ws.userservice.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ndrewcoding.app.ws.shared.Utils;
import br.com.ndrewcoding.app.ws.ui.controller.UserController;
import br.com.ndrewcoding.app.ws.ui.model.request.UserDetailsRequestModel;
import br.com.ndrewcoding.app.ws.ui.model.response.UserRest;
import br.com.ndrewcoding.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

	Utils utils;

	public UserServiceImpl() {
	}

	@Autowired
	public UserServiceImpl(Utils utils) {
		this.utils = utils;
	}

	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		String userId = utils.generateUserId();
		returnValue.setUserId(userId);

		if (UserController.getUsers() == null)
			UserController.setUsers(new HashMap<>());
		UserController.getUsers().put(userId, returnValue);

		return returnValue;
	}

}
