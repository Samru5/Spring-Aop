package com.capgemini.spring.model;
import org.springframework.stereotype.*;


@Component
public class Validator implements Demo{

	@Override
	public void check(int age) throws Exception
	{
		if(age>18)
		{
		System.out.println("Do voting");
			
		}
		else
		{
			//throw new InvalidAgeException("Invalid age");
			throw new ArithmeticException("Not Valid Age");  
		}
		
		
	}
}
