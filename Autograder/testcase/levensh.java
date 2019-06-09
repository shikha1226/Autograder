import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class levensh {

	@Test
    public final void testDistance() {
       // System.out.println("distance");
        levensh instance = new levensh();
        assertEquals(1.0, instance.comldistance("My string", "My tring"), 0.0);
        assertEquals(2.0, instance.comldistance("My string", "M string2"), 0.0);
        assertEquals(1.0, instance.comldistance("My string", "My ring"), 0.0);

        // With limits.
        assertEquals(2.0, instance.comldistance("My string", "M string2", 4), 0.0);
        assertEquals(2.0, instance.comldistance("My string", "M string2", 2), 0.0);
        assertEquals(1.0, instance.comldistance("My string", "M string2", 1), 0.0);

      //  NullEmptyTests.testDistance(instance);
    }
@Test

public final void testsimil() {
	levensh sim = new levensh();
	assertEquals(sim.similarity(40.00), sim, 0);
}
	
@Test
public final void trytest() {
	
	levensh tryt = new levensh(); 
	assertThat(Arrays.asList(),
	equalTo(Arrays.asList()));
}



	private void assertThat(List<Object> asList, Object equalTo) {
	// TODO Auto-generated method stub
	
}
	private Object equalTo(List<Object> asList) {
	// TODO Auto-generated method stub
	return null;
}
	private double similarity(double d) {
	// TODO Auto-generated method stub
	return 0;
}
	private Object comldistance(String string, String string2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void assertEquals(double d, Object comldistance, double e) {
		// TODO Auto-generated method stub
		
	}

	private Object comldistance(CharSequence s1, CharSequence s2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
