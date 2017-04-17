package springjpa.test;

import javax.persistence.PersistenceContext;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springjpa.cof.DbCof;
import springjpa.dao.UserDao;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DbCof.class)
public class Test {
	
	
	@Autowired
	private static UserDao ud;
	
	@org.junit.Test
	public void read(){
		System.out.println(ud.findAll());
	}
	
	
	public static void main(String[] args) {
		System.out.println(ud);
	}
	
}
