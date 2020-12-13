package br.com.ndrewcoding.app.ws.userservice;

import br.com.ndrewcoding.app.ws.ui.model.request.UserDetailsRequestModel;
import br.com.ndrewcoding.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
