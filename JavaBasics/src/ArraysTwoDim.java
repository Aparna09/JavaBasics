

public class ArraysTwoDim {

	public static void main(String[] args) {
		int person1[] = { 5, 30 }; // height and age and percentage
		int person2[] = { 6, 32 }; // height and age
		int person3[] = { 7, 34 }; // height and age

		
		int persons[][] = { person1, person2, person3 };	
		
				
		System.out.println("=======================");
		
		for(int i = 0 ; i < persons.length ; i++) {
			for(int  j = 0; j < persons[i].length ; j++) {
				System.out.print(persons[i][j] + "\t " );
			}

		}
		
		System.out.println(" Enhanced for loop");
		
		for(int[] i: persons){
			for(int j : i){
				System.out.print(j+" \t");
			}

		
		}
	}
}
