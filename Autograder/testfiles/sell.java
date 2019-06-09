public class sell {
 
	
	public static int mxprofit(int[] i){
		int k= i[0];
		  int n = 0;
		
  if(i == null||i.length< 2){
   return 0;
  }
   
  for (int j=0; j<i.length; j++) {
 
   if(i[j] < k)
   {
    k= i[j];
   }
   else if
   
    (i[j]-k > n)
    {
     n=i[j]-k;
    }
   }
  
  return n;
 }
 
 public static void main(String[] args) {
	  int b = mxprofit(new int[]{7,1,5,3,6,4});
	  System.out.println(b);
	 }
	 
 
}