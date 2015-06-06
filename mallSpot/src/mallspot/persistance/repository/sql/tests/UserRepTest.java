package mallspot.persistance.repository.sql.tests;

import static org.junit.Assert.*;
import mallspot.model.entity.User;
import mallspot.model.entity.UserType;
import mallspot.persistance.repository.UserRepository;
import mallspot.persistance.repository.sql.UserRepositorySQL;

import org.junit.Test;

public class UserRepTest {
UserRepository rep = new UserRepositorySQL();
User user = new User("name","em","pass",UserType.USER);
//	@Test
//	public void testAddUser() {
//		assertEquals(true, rep.addUser(user));
//	}
	@Test
	public void testGetUser() {
		assertEquals("name", rep.getUserByLogin("em").getFirstName());
	}

}
