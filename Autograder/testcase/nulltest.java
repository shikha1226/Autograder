import org.junit.Assert;

	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;
	import static org.junit.Assert.fail;

	public class nulltest {

	   
	    public static void testSimilarity(pairstring instance) {
	        assertEquals(1.0, instance.comldistance("", ""), 0.1);
	        assertEquals(0.0, instance.comldistance("", "foo"), 0.1);
	        assertEquals(0.0, instance.comldistance("foo", ""), 0.1);

	        try { 
	        	
	            instance.comldistance(null, null);
	            fail("A NullPointerException was not thrown.");
	        } catch (NullPointerException ignored) {
	        }

	        try {
	            instance.comldistance(null, "");
	            fail("A NullPointerException was not thrown.");
	        } catch (NullPointerException ignored) {
	        }

	        try {
	            instance.comldistance("", null);
	            fail("A NullPointerException was not thrown.");
	        } catch (NullPointerException ignored) {
	        }
	    }


	
}
