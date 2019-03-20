package com.ss.algorithms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;



// import hello.Model;
// import hello.RequestParam;


@RestController
public class AlgorithmController {
	
	  //private CredhubProperties credhubProperties;

	  //  public CredhubValueController(CredhubProperties credhubProperties) {
	  //      this.credhubProperties = credhubProperties;
	  //  }
	  String usage="Usage: http://localhost:8080/arithmetic?firstValue=15&secondValue=5&operator=add" ;
	
	   @GetMapping("/")
	   public String getIndex() {
		   return "index.html" ;
	   }
	   
	   @GetMapping("/arithmetic")
	    public String getArithmetic(@RequestParam(value="firstValue", defaultValue="10") String firstValue 
	    		             , @RequestParam(value="secondValue", defaultValue="10") String secondValue
	    		             , @RequestParam(value="operator", defaultValue="add") String operator
	    		)  {
	    	int firstVal = Integer.parseInt( firstValue ) ;
	    	int secondVal = Integer.parseInt( secondValue ) ;
	    	// String usage="Usage: http://localhost:8080/arithmetic?firstValue=15&secondValue=5&operator=add" ;
	    	Arithmetic arithmeticClass;
			try {
				arithmeticClass = new Arithmetic( firstVal , secondVal, operator);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return( usage);
			}
			System.out.println( "Result is " + arithmeticClass.getResult());
			return (  "Result is " + arithmeticClass.getResult() );
			
	    	//return ("5") ;
	    	
	    }

	       
	    // Greatest Common Divisor  - Test
	    @GetMapping("/gcd")
	    public String gcd( 
	    		         @RequestParam(value="firstValue", defaultValue="10") String firstValue 
	                     ,@RequestParam(value="secondValue", defaultValue="10") String secondValue
	    		) {
	    	int firstVal = Integer.parseInt( firstValue ) ;
	    	int secondVal = Integer.parseInt( secondValue ) ;
	    	GreatestCommonDivisor gcd = new GreatestCommonDivisor( firstVal, secondVal);
			System.out.println( "Result is " + gcd.getResult());
			return (  "Result is " + gcd.getResult() );
	    }
	    
	    @GetMapping("/fibonacciseries")
	    public String getfibonacciseries(@RequestParam(value="resultCount", defaultValue="10") String resultCount ) 
	    {	             
	    	int count = Integer.parseInt( resultCount ) ;
	    	//int secondVal = Integer.parseInt( secondValue ) ;
	    	// String usage="Usage: http://localhost:8080/arithmetic?firstValue=15&secondValue=5&operator=add" ;
	    	String result = "0, 1" ;
	    	Arithmetic arithmetic = null ;
	    	int firstVal = 0;
	    	int secondVal = 1;
	    	String operator="add";
	    	
	    	
	    	while ( count > 0 )
	    	{
	    		try {
					arithmetic= new Arithmetic( firstVal, secondVal , operator );
					firstVal = secondVal ;
					secondVal = arithmetic.getResult() ;
					result = result + ", " + secondVal ;
					count-- ; 
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return usage;
				}
	    	}
	    	
			//System.out.println( "Result is " + arithmeticClass.getResult());
			return (  "Fibonacci series for " + resultCount + " numbers is " + result );
			
	    	
	    }
	    
	   
	}


