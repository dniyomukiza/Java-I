package edu.institution;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.Assert;

public class UserAccountTest {

	
	//Asserting that the getUserName method is returning the supplied user name
		
	    @Test	
		public void returningName() { 
			
			UserAccount user1= new UserAccount("Valens","2343");
			
			Assert.assertSame("Valens", user1.getUsername());
			
	    }
			
	//Passing a correct password and assert the return value is true
	    
	    @Test	
		public void passwordCorrect() { 
				
			UserAccount user1= new UserAccount("Wayne","ionos12");
				
			Assert.assertTrue(user1.isPasswordCorrect("ionos12"));}	
	//Passing an incorrect password and assert the return value is false		
		
	    @Test	
		public void passwordIncorrect() { 
					
			UserAccount user1= new UserAccount("Wayne","ionos12");
					
			Assert.assertFalse(user1.isPasswordCorrect("sunrays"));
			}
	//Passing null for password and assert the return value is false					
		
		@Test	
					 
		public void passworIncorrect() { 
						
					UserAccount user1= new UserAccount("Wayne","ionos12");
						
					Assert.assertFalse(user1.isPasswordCorrect(null));
			
		                                }
		
		//Calling the toString method and assert that the value returned equals the value returned from the getUsername method
        
		@Test	
		 
        public void callToString() { 
			
		UserAccount user1= new UserAccount("John","sinclair1");
		
		Assert.assertEquals(user1.toString(), user1.getUsername());

                                   }
     
        //Passing same username and then compare them
        
        @Test	
		 
        public void sameUsername() { 
			
		UserAccount user1= new UserAccount("jacky","1111");
		UserAccount user2= new UserAccount("jacky","9999");
	
		Assert.assertTrue(user1.equals(user2));
		                            }

        //Passing different usernames and compare
        
        @Test	
		 
        public void notSameUsername() { 
			
		UserAccount user1= new UserAccount("jane","1111");
		UserAccount user2= new UserAccount("jacky","9999");
	
		Assert.assertFalse(user1.equals(user2));
                                  }
     // call equals method and pass a different object
        
        @Test	
		 
        public void differentObject() { 
			
		UserAccount user1= new UserAccount("jane","1111");
		UserAccount user2= new UserAccount("jacky","9999");
		
		Assert.assertFalse(user1.equals(new UserAccount("Rob","polaand")));

                                         }
        
        //  Call the hashCode method and assert that the value returned is not equal to zero
	
        @Test	
		 
        public void testhashCode() { 
			
		UserAccount user3= new UserAccount("Janet","...rwa");
		int a=0;
		
		Assert.assertNotEquals((user3.hashCode()), a);
           
        }

}
