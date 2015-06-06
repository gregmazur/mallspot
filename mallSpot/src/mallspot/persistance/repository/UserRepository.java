package mallspot.persistance.repository;

import mallspot.model.entity.User;

public interface UserRepository {

	User getUserByLogin(String email);

	User getUser(String email, String password);

	boolean addUser(User user);

	boolean updateUser(User user, String email, String password);

	boolean removeUser(String email, String password);

	

}
