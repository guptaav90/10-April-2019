package Programs;

public class StartPattern1 {

	public static void main(String[] args) {

		/*
		
		
		*
		**
		***
		****
		
		**/
		
		
		
		for(int i=1;i<=4;i++) {                 
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			
			
			System.out.println();
			
			
		}
		
		
		System.out.println("----------------");
		
		
		
		/*
                
                ****
                ***
                **
                *
		
		
*/		
		
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("----------------");
		/*

		*
		**
		***
		****
		***
		**
		*
		
		*/
		
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			
			for(int j=3;j>=i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
