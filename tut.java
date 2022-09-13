public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        print_arr_args("sms");
        test_1();
        test_2();
        test_3();
        test_4();
        test_5();
        test_6();
        test_7();
        test_8();
        test_9();
        test_10();
        test_11();
        test_12();
        test_13();
    }

    public static void print_arr_args(String value) {
        for (int i = 0; i < 10; i += 1) {
            System.out.println(value);
            // Ssss
            /*
            s
            s
            */
            int val_int = 10;
            String val_str = "10";
            float val_float = 10.0f;
            double val_dou = 10.0;
            char val_char = 'a';
            boolean val_bool = true; 
            
            // final vals:
            final int myNum = 15;
            
            // many
            int x = 5, y = 6, z = 50;
            
            int _x, _y, _z;
			_x = _y = _z = 50;
        }
    }
    
    public static void test_1() {
        System.out.println("Hello World --- 1");
        int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
        
        /*
        Primitive data types - includes byte, short, int, long, float, double, 			boolean and char
		Non-primitive data types - such as String, Arrays and Classes (you 			will learn more about these in a later chapter)
        */
        float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
        
        //
        byte myNum_b = 100;
		System.out.println(myNum_b);  // -128 to 127
        
        short myNum_s = 5000;
		System.out.println(myNum_s);  // -32768 to 32767

		int myNum_i = 100000;
		System.out.println(myNum_i);  // -2147483648 to 2147483647

		long myNum_l = 15000000000L;
		System.out.println(myNum_l);  // -9223372036854775808 to 9223372036854775807
    }
    
    public static void test_2() {
        System.out.println("Hello World --- 2");
        // varibales casting
        /*Widening Casting (automatically) - converting a smaller 
        type to a larger type size
		byte -> short -> char -> int -> long -> float -> double
		Narrowing Casting (manually) - converting a larger type to a 
        smaller size type
		double -> float -> long -> int -> char -> short -> byte
		*/
        double myDouble = 9.78d;
    	int myInt = (int) myDouble; // Manual casting: double to int
    }
    
    public static void test_3() {
        System.out.println("Hello World --- 3");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " +txt.length());
        
        String ttxt = "Hello World";
		System.out.println(ttxt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(ttxt.toLowerCase());   // Outputs "hello world"
        
        String tttxt = "Please locate where 'locate' occurs!";
		System.out.println(tttxt.indexOf("locate")); // Outputs 7
        
        String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
        // txt.length()
        // .toUpperCase()
        // .toLowerCase()
        // .indexOf("locate") - first include
        // firstName.concat(lastName) - concatination of two strings
        
    }
    
    public static void test_4() {
        System.out.println("Hello World --- 4");
        String x = "10";
		int y = 20;
		String z = x + y;  // z will be 1020 (a String)
        System.out.println(z);
    }
    
    public static void test_5() {
        System.out.println("Hello World --- 5");
        System.out.println(Math.max(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
    
    public static void test_6() {
        System.out.println("Hello World --- 6");
        if (true) {
        	System.out.println("H");
			// block of code to be executed if the condition is true
		} else {
			// block of code to be executed if the condition is false
		}
        
        int time = 22;
		if (time < 10) {
  			System.out.println("Good morning.");
		} else if (time < 20) {
  			System.out.println("Good day.");
		} else {
  			System.out.println("Good evening.");
		}
        // variable = (condition) ? expressionTrue :  expressionFalse;
    }
    
    public static void test_7() {
        System.out.println("Hello World --- 7");
        int day = 4;
		switch (day) {
  			case 1:
    			System.out.println("Monday");
    			break;
  			case 7:
    			System.out.println("Sunday");
    			break;
            default:
            	System.out.println("Sunday");
    			break;
			}
    }
    
    public static void test_8() {
        System.out.println("Hello World --- 8");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
  			System.out.println(i);
		}
    }
    
    public static void test_9() {
        System.out.println("Hello World --- 9");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(cars[0]);
        cars[0] = "Opel";
		System.out.println(cars[0]);
        System.out.println(cars.length);
        
        // Multi-Dimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7
    }
    
    public static void test_10() {
        System.out.println("Hello World --- 10");
        
    }
    
    public static void test_11() {
        System.out.println("Hello World --- 11");
        
    }
    
    public static void test_12() {
        System.out.println("Hello World --- 12");
        
    }
    
    public static void test_13() {
        System.out.println("Hello World --- 13");
        
    }
}

