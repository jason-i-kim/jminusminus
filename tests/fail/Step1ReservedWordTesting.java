// This test is meant to check that the scanner correctly identifies tokens we have added
// to the scanner. It should be run using j-- with the option -t. 
// The output needs to be checked by hand to be sure the added tokens were properly
// identified as such and not as literals or other

package pass;

import java.lang.annotation.Native;
import java.io.Serializable;

	// INTERFACE	::= "interface"		// added step 1
interface A
{public void aaa();}

	// IMPLEMENTS	::= "implements"		// added step 1 
public class Step1ReservedWordTesting implements A{	
		// TRANSIENT		::= "transient"		// added step 1
	transient int i;

		// VOLATILE		::= "volatile"		// added step 1
	volatile int vo;
		
    		// NATIVE		::= "native"			// added step 1
    		// THROW	S		::= "throws"			// added step 1
	native void testnative()throws Exception;

		// SYNCHRONIZED	::= "synchronized"	// added step 1
	synchronized void testsynchro() {};
 
		// STRICTFP		::= "strictfp"		// added step 1
	strictfp void teststrictfp() {};

	public static void main(String[] args) {
			// FOR				::= "for"			// added step 1
		for (int j=0; j<=6; j++)
		{
			// CONTINUE			::= "continue"	// added step 1 
		continue;
		}
		
			// FINALLY			::= "final"			// added step 1 
			// BYTE				::= "byte"			// added step 1
		final byte by = 6 ;
             // SHORT			::= "short"			// added step 1
		short sh = 7;
             // LONG				::= "long"			// added step 1
		long lo = 7;
             // FLOAT			::= "float"			// added step 1
		float fl = 8;		
			//	DOUBLE			::= "double"			// added step 1
		double dou =9;
		
			// TRY				::= "try"			// added step 1
        try  
          	{sh = 7;}
          	// CATCH				::= "catch"			// added step 1
        catch(ArithmeticException e)  
          {
        	  lo = 7;
              // THROW			::= "throw"			// added step 1
        throw new ArithmeticException();
          }
          	// FINALLY			::= "finally"		// added step 1        
        finally  
          	{fl = 8;}
        
        		//	DO				::= "do"				// added step 1
        do
        {
           fl = 9;;
        } while(false);

		switch (sh) {
             // CASE				::= "case"			// added step 1
		case 7:
             // 	BREAK			::= "break"			// added step 1			
			break;
			//	DEFAULT			::= "default"		// added step 1
		default :		
			// CONST and GOTO  are reserved keywords, but are not part of the language 
			// as they have never been implemented
			// hence they cause an error from the java compiler (and eclipse editor)
			
            // CONST			::= "const"			// added step 1
			const;
            // GOTO				::= "goto"			// added step 1
			goto;
			
		}
	}

//	@Override
	public void aaa() {
		// TODO Auto-generated method stub		
	}

}
