import org.junit.Test;

public class pairstring<P,Q> //generic type elements of pair
{
    	

public P fir;
public Q sec;

  	public pairstring(P first, Q second)    //constructor
    	    {
    	        this.fir = first;
    	        this.sec = second;
    	    }
    	 
    public boolean equals(Object otr)		//check for similar pairs
    	    {
    	        if (otr instanceof pairstring)
    	        {
    	            //@SuppressWarnings("unchecked")
    	                @SuppressWarnings("unchecked")
						pairstring<P, Q> otherpair = (pairstring<P, Q>) otr;
    	            return (( this.fir == otherpair.fir ||
    	                      (this.fir != null && otherpair.fir != null &&
    	                       this.fir.equals(otherpair.fir))) &&
    	                    ( this.sec == otherpair.sec ||
    	                      ( this.sec != null && otherpair.sec != null &&
    	                        this.sec.equals(otherpair.sec))) );
    	        }
    	        return false;
    	    }

    	    //display pairs
    	    public String toString()
    	    { 
    	        return "" + fir + ", " + sec + ""; 
    	    }

    	    public P getFirst() {
    	        return fir;
    	    }

    	  
    	    public void setFirst(P first) {
    	        this.fir = first;
    	    }

    	    public Q getSecond() {
    	        return sec;
    	    }

    	   
    	    public void setSecond(Q second) {
    	        this.sec = second;
    	    }
    	    
    	    //Levenshtein Distance Algorithm
    	    
    	    private static int minimum(int x, int y, int z)	//calculates minimum number
    	    { 
    	        return Math.min(Math.min(x, y), z);
    	    }
    	    
    	    //increment value
    	    public static String form(double val, int n) 
    	    {			
    	        double inc = 0.5;
    	        for (int j = n; j > 0; j--)
    	        {
    	            inc /= 10;
    	        }
    	        val += inc;
    			
    	        String s = Double.toString(val); //chance value to string
    	        int a1 = s.indexOf('.');
    	        int b2 = s.length() - a1 - 1;
    			
    	        if (n > b2)
    	        {
    	            s = s + ZEROES.substring(0, n - b2);
    	        }
    	        else if (b2 > n) 
    	        {
    	            s = s.substring(0, a1 + n + 1);
    	        }
    			
    	        return s;
    	    }
    	    
    	    
    	 //calculate levenshtien distance for two character sequence 
    	    public static int comldistance(CharSequence s1, CharSequence s2) 
    	    {
    	        int[][] dist = new int[s1.length() + 1][s2.length() + 1];

    	        for (int i = 0; i <= s1.length(); i++) 
    	        {
    	            dist[i][0] = i;
    	        }
    	        for (int j = 0; j <= s2.length(); j++)
    	        {
    	            dist[0][j] = j;
    	        }
    	        
    	        int i=1;
    	        while (i <= s1.length())
    	        {
    	            for (int j = 1; j <= s2.length(); j++) 
    	            {
    	                dist[i][j] = minimum(dist[i - 1][j] + 1,dist[i][j - 1] + 1,dist[i - 1][j - 1] 
    	                    + ((s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1));
    	            }
    	            i++;
    	        }

    	        return dist[s1.length()][s2.length()];
    	    }
    		
    	    
    	    
    	    private static final String ZEROES = "000";
    	    
    	 
    	
        public static double similarity(double distance,String out, String out1) 
	    {
         
        	
			double sim = Math.abs((1.0 - (double)distance /  Math.max(out.length(), out1.length()))) * 100;
        	
			return sim;
        	   
        	
        	    }
    	    
    	    
    	}
