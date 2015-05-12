
public class ArithmeticOperators {

	public static void main(String[] args) {
		// DataTypes: byte , short , int , long , double ,float:
		// upcasting:
		byte b = 127;
		short s = b;
		System.out.println("upcasting a byte b to short s : " + s);
		int i = b;
		System.out.println("upcasting a byte b to int i : " + i);
		int year = 1979;
		long l = year;
		System.out.println("upcasting a int year to long l  : " + l);
		long mylong = 124567;
		double mydouble = mylong;
		System.out.println("upcasting a long mylong to double mydouble : "
				+ mydouble);
		
		// downcasting:
		System.out.println("-----");
		short s1 = 129;
		byte b1 = (byte) s1;
		System.out.println("downcating short s1 to byte b1:" + b1);
		double d = 13.6;
		float f1 = (float) d;
		System.out.println("downcating double d   to float f1:" + f1);
		int i1 = (int) d;
		System.out.println("downcating double d  to int i1:" + i1);

		// Arthimetic operators +, - , * , / , % ;
		System.out.println("----");
		System.out.println("Arthimatic operators");
		int noOfDaysCount = 5;
		int totalCount = noOfDaysCount + 1;
		System.out.println(noOfDaysCount + " + " +  1  + " =" + totalCount);
		int count = noOfDaysCount - 1;
		System.out.println(noOfDaysCount + "- " +  1  + " =" + count);
		int noOfDays = noOfDaysCount * 2;
		System.out.println(noOfDaysCount + " * " +  2  + " =" + noOfDays);
		int reminder = noOfDays % 5;
		System.out.println(noOfDaysCount + " % " +  5 + " =" + reminder);

		// increment and decrement operators:

		System.out.println("---");
		System.out.println("increment");
		int days = 5;
		days++;
		System.out.println("Incrementing the  days by 1: " + days);
		days--;
		System.out.println("Decremneting the days  by 1: " + days);

		System.out.println("----");
		int age = 6;
		age += 1;
		System.out.println("+= : " + "Age  6 is now : increment by 1 : " + age);
		double height = 6.5;
		height -= 2;
		System.out.println("-= : " + "Height 6.5 is now : decrement by 2 : " + height);

		byte volume = 2;
		volume *= 4;
		System.out.println("*= : " + "volume 2 is now: twice itself : " + volume);

		double avg = 44.5;
		avg /= 5;
		System.out.println("/= : " + " average is : " + avg);

		float value = 5.5f;
		value %= 2;
		System.out.println("%= : " + " total value  is : " + value);


	}

}
