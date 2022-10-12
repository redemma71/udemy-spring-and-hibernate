package com.chadcover.springdemo;

import com.chadcover.springdemo.config.SpringDemoConfig;
import com.chadcover.springdemo.dao.AccountDAO;
import com.chadcover.springdemo.dao.MembershipDAO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		System.out.println("Yadda Yadda Yadda; I'm the main application!");
		// read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringDemoConfig.class);

		// get the AccountDAO bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		// call the business method
		Account theAccount = new Account();
		theAccountDAO.addAccount(theAccount, false);
		int accountDAOSum = theAccountDAO.addNumbers(60, 9);

		int accountDAOSquare = theAccountDAO.squareNumber(9);

		// get the MembershipDAO bean from spring
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		theMembershipDAO.addAccount();
		theMembershipDAO.addNumbers();

		// close the context
		context.close();
	}

}
