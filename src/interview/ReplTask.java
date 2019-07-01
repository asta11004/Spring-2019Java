package interview;

public class ReplTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two dimensional array store one dimensional array as per item 
	  int[][] data = {  
			  			{1,4} , 
			  			{8,9}  
			  		} ; 
	  int twoD_itemCount = data.length ; 
	  System.out.println("the size of the array is " + twoD_itemCount );
	  
	  // how do we get first item of two D array :
	   int[] firstItemOf2D_array = data[0] ; 
	   System.out.println("first Item Of 2D_array size is " + firstItemOf2D_array.length );
	
	   
	 // how do we get second item of two D array :
	   System.out.println("size of second Item Of 2D_array is " +  data[1].length );
			  
	   //// determine whether 2d array item count is equal to each 1D array item count 
	   //// if so it's seen as square 
	   ///  just like excel sheet having same row count and column count 
	   
	   
	   // we are looking for one 1D array item of the 2D array different size than 2D Array 
	   
	   for (int i = 0; i < twoD_itemCount; i++) {
		   // compare the size of each Item with 2D array item count  
		   
		   //System.out.println(  data[i].length    );
		   if( data[i].length != twoD_itemCount ) {
			   System.out.println("THIS IS NOT A SQUARE!!!");
			   return ; 
		   }		      
//		   if( data[i].length == twoD_itemCount ) {
//			   System.out.println("size match");
//		   }else {
//			   System.out.println("size does not match");
//		   }
		   
	   }
	   System.out.println("THIS IS A SQUARE!!!");
	   
	   
	   
		
	}

}
