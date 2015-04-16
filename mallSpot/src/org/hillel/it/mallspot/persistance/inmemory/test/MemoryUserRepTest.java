package org.hillel.it.mallspot.persistance.inmemory.test;

import static org.junit.Assert.*;

import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.model.entity.UserType;
import org.hillel.it.mallspot.persistance.inmemory.MemoryUserRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemoryUserRepTest {
	
	private static UserType  STOREADMIN;
	public static MemoryUserRepository memory = new MemoryUserRepository();
	static User user1 = new User("log1","pass1",null,null,null,null);
	static User user2 = new User("log2","pass2",null,null,null,null);
	static User user3 = new User("log3","pass3",null,null,null,null);
	static User user4 = new User("log4","pass4",null,null,null,null);
	static User temp = new User("temp","just",null,null,null,null);
	static User admin1 = new User("admin1","admin",STOREADMIN,null,null,null);
	static User admin2 = new User("admin2","admin",STOREADMIN,null,null,null);
	static User admin3 = new User("admin1","admin",STOREADMIN,null,null,null);
	@BeforeClass
	public static void beforeStart(){
	memory.insertStoreAdmin(admin1);	
	memory.insertStoreAdmin(admin2);
	memory.insertStoreAdmin(admin3);
	memory.insertUser(user1);
	memory.insertUser(user2);
	memory.insertUser(user3);
	memory.insertUser(user4);
	
	}
	@Test
	public void testGetUserByLogin() {
		
		assertEquals(user3,memory.getUserByLogin("log3"));
		assertEquals(user3,memory.getUserByLogin("log3"));
	}
	@Test
	public void emptyRep(){
		MemoryUserRepository empty = new MemoryUserRepository();
		assertEquals(null,empty.getUserByLogin("log3"));
	}
	@Test
	public void testSize() {
		assertEquals(4,memory.usersSize());
	}
	@Test
	public void testGetUserByLoginNPass() {
		
		assertEquals(user3,memory.getUserByLoginAndPassword("log3","pass3"));
		assertEquals(admin1,memory.getUserByLoginAndPassword("admin1","admin"));
	}
	@Test
	public void testRemoveUser() {
		memory.removeUser("log1","pass1");
		assertEquals(3,memory.usersSize());
	}
	@Test
	public void testUpdateUser() {
		
		memory.updateUser(temp, "log2", "pass2");
		
	
		assertEquals(temp,memory.getUserByLogin("temp"));
		
	}
	

}
