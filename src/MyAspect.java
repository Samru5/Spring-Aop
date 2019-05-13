package com.capgemini.spring.aspects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;


@Component
@Aspect
public class MyAspect
{



@AfterThrowing(pointcut="execution(* com.capgemini.spring.model.Validator.check(..))",throwing="error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) throws Exception
	{
		
		System.out.println("Exception : " + error);
		System.out.println("Information: " + joinPoint.getSignature().getName());
		

		
		}
		
	
}