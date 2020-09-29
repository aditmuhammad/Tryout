public class SortingTryout{
	public static void main(String[] args){     
    	int [] deret = new int [] {4,9,7,5,8,9,3};     
    	int temp = 0;

       	System.out.println("Data yang diinputkan: ");    
       	for (int i = 0; i <deret.length; i++) {     
       	    System.out.print(deret[i] + " ");    
       	}    

        for (int i = 0; i <deret.length; i++) {     
        	for (int j = i+1; j <deret.length; j++) {     
            	if(deret[i] >deret[j]) 
            	{      
                	temp = deret[i];    
                	deret[i] = deret[j];    
                	deret[j] = temp;    
            	}     
            }   
        }    
            
        System.out.println("\nPengurutan Data: ");    
        for (int i = 0; i <deret.length; i++) {     
            System.out.print(deret[i] + " ");    
        }   
	}
}