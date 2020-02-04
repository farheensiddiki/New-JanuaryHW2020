
public class januaryHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
// ------ CONCATINATION ------ //
//		
//		String myName = "Farheen";
//		String address = "12024 Valcour Island Way";
//		String techSchool = "TechCircle";
//		
//	System.out.println(myName + " is a student of " + techSchool + " and the address of the school is" + address);
//		
	
// ----- PRIMITIVE DATA TYPE ----- //
		
//	
//		int firstNumber = 10;
//		int secondNumber = 10;
//		
//		boolean a = (firstNumber == secondNumber);
//		System.out.println(a);
		
		
// ------ OBJECTIVE DATA TYPE -----------
			
//				Integer objectNumber = new Integer(6);
//				Integer objectSecNumber = new Integer(6);
//		
//				boolean b = (objectNumber.equals(objectSecNumber));
//				System.out.println(b);
//		
//		String myString = new String("Farheen");		
//		
		
// ----- ARITHIMATIC OPERATOR ------ // 
		
			
		int firstNumber = 44;
		int secondNumber = 234;
		int thirdNumber = 212;
		int fourthNumber = 12;
		
		int additionResults = firstNumber + fourthNumber;
		int subtractionResults = fourthNumber - thirdNumber;
		int multipilicationResults = thirdNumber *4;
		int divisionResults = fourthNumber/4;
		int modulaResults = thirdNumber%fourthNumber;
		
		int postIncrementResults = ++thirdNumber;
		int postDecrementResults = --thirdNumber;
		
		
		System.out.println("Added Results are = " + additionResults);
		System.out.println("Subtracted Results are = " + subtractionResults);
		System.out.println("Multiplied Results are = " + multipilicationResults);
		System.out.println("Divided Results are = " +divisionResults);
		System.out.println("The Modula Results are = " +modulaResults);
		System.out.println("Incremented Results are = " +postIncrementResults);
		System.out.println("Drecremented Results are = " +postDecrementResults);
	
			
		int addAll = (firstNumber + secondNumber + thirdNumber + fourthNumber);
		System.out.println(++addAll);
		
		
// ----- RELATION OPERATOR ------ // 
	
		
//	    long number1 = 2342;
//	    long number2 = 2342;
//	    long number3 = 345;
//	    long number4 = 234;
//	    long number5 = 78;
//	    
//	    boolean equals = number1 == number5;
//	    boolean notequal = number3 !=22;
//	    boolean greaterThan = number5>33332;
//	    boolean lessThan = number4 < number5;
//	    boolean greaterThanOrEqualTo = number1 >= number2;
//	    boolean lessThanOrEqualTo = number4 <= 234234;
//	    
//	    System.out.println("Equals Results are = " + equals);
//	    System.out.println("Not Equals Results are = " + notequal);
//	    System.out.println("Greater Than Results are = " + greaterThan);
//	    System.out.println("Less Than Results are = " + lessThan);
//	    System.out.println("Greater Than Or Equal To Results are = " + greaterThanOrEqualTo);
//	    System.out.println("Less Than Or Equal To Results are = " + lessThanOrEqualTo);

		
		
// ----- LOGICAL OPERATOR ---- //
		
		
//		int a = 3;
//		int b = 5;
//		int c = 4;
//		int d = 1;
//		
//		boolean booleanResults1 = (((a==b)||(c==d))); 
//		boolean booleanResults2 = ((a==b)|(c==d));
//		boolean booleanResults3 = !((a==b)&&(c==d));
//	
//		System.out.println(booleanResults1);
//		System.out.println(booleanResults2);
//		System.out.println(booleanResults3);

		
////////// ***** DIDNOT UNDERSTAND ***** /////////
		
//		float myInt = (float)12 / (float)15;
//		System.out.println(myInt);		
//   	int modulaOne = 978;

		
// ----- ASSIGNMENT OPERATOR ----- //
  
		
//		int a = 1;
//		int b = 3;
//		int c = 5;
//		int d = 6;
		
//		System.out.println(a); //1
		
//		a = a + b;   // "a" becomes 4 because 1 + 3 "a + b"
//		a+=b;        // "a" became "4" and now you add "b" which is "3" and it will become "7".
		
//		System.out.println(a); //4
		
//		c = c-d; // here you are subtracting 5 from 6 so answer is -1
	
//		System.out.println(c);
	
//		c -=d;
		
//		// + is concatenation
		
//		System.out.println("c is".concat(" Hello World"));
	
//		System.out.println("c is " + c);
		
//		d*=a; // MULTIPLICATION
	
//		System.out.println("D is " +d);

		
//		d/=b;
		
//		System.out.println("D is " + d);
	
//		d%=a;
		
//		System.out.println("D is "+d);
		
//		a<<=c;
		
//		System.out.println();
		
// ----- TERNARY OPERATOR ---- //
		
// variable x = (expression) ? value is true : value is false
		
		int  a, b;
		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println( "value of b is :  " + b );
		
		b = (a == 10) ? 20 : 30;
		System.out.println( "Value of b is : " + b );
	
		
		final int finalValue = 4;
		

	}

}
