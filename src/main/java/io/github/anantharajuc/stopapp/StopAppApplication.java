package io.github.anantharajuc.stopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * StopApp Application
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@SpringBootApplication
public class StopAppApplication implements CommandLineRunner 
{
	@Autowired
    private ApplicationContext appContext;

	public static void main(String[] args) 
	{
		SpringApplication.run(StopAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Start Application"); 	
		
		//my business logic/code
		System.out.println("Executing my business logic!"); 	
		
		System.out.println("calling application shutdown method."); 	
		
		initiateShutdown(0);
	}
	
	//Method to shutdown the application
	public void initiateShutdown(int returnCode)
	{
		System.out.println("Shutting Down Application"); 
		
        SpringApplication.exit(appContext, () -> returnCode);
    }
}
