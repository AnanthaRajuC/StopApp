# StopApp

Programmatically shut down Spring Boot (Web) Application

```
package io.github.anantharajuc.stopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
		
		initiateShutdown(0);
	}
	
	//Method to shutdown the application
	public void initiateShutdown(int returnCode)
	{
		System.out.println("Shutting Down Application"); 
		
		SpringApplication.exit(appContext, () -> returnCode);
    	}
}
```

Reference - https://stackoverflow.com/a/34946292/3711562

## License

Distributed under the MIT License. See [LICENSE.MD](/LICENSE.MD) for more information.

<!-- CONTACT -->
## Contact

Anantha Raju C - [@anantharajuc](https://twitter.com/anantharajuc) - arcswdev@gmail.com

Project Link: [https://github.com/AnanthaRajuC/StopApp](https://github.com/AnanthaRajuC/StopApp)
