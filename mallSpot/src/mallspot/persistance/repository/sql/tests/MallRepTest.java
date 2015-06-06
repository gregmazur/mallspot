package mallspot.persistance.repository.sql.tests;

import static org.junit.Assert.*;
import mallspot.model.entity.Mall;
import mallspot.model.entity.User;
import mallspot.persistance.repository.MallRepository;
import mallspot.persistance.repository.sql.MallRepositorySQL;

import org.junit.Test;

public class MallRepTest {
	MallRepository malrep = new MallRepositorySQL();
	Mall mall = new Mall("test Mall");
	Mall mallWDescription = new Mall("Mall test with discription");
	User user = new User("user", "email", "pass",null);
	

	@Test
	public void testWithNoParametrs() {
		assertEquals(false, malrep.addMall(mall, null));
	}
	@Test
	public void testWithUserWitoutIDnCreatedBy() {
		assertEquals(true, malrep.addMall(mall, user));
	}
	@Test
	public void test() {
		mall.setId(1);
		assertEquals(true, malrep.addMall(mallWDescription, user));
	}
	@Test
	public void testDeleteNoID() {
		assertEquals(true, malrep.remove(mall));
	}
	@Test
	public void testDeletewithID() {
		mall.setId(1);
		assertEquals(true, malrep.remove(mall));
	}
	@Test
	public void testDeletewithID2() {
		mall.setId(2);
		assertEquals(true, malrep.remove(mall));
	}
	@Test
	public void testDeletewithID3() {
		mall.setId(3);
		assertEquals(true, malrep.remove(mall));
	}
	@Test
	public void testDeletewithID4() {
		mall.setId(4);
		assertEquals(true, malrep.remove(mall));
	}

}
