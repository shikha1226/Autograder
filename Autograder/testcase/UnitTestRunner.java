import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestSuite;

public class UnitTestRunner {
	static JUnitCore junitCore;
    static Class<?> testClasses;

    public static void main(String[] args) {
        System.out.println("Running Junit Test Suite.");
        Result result = junitCore.run(Alltest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Successful: " + result.wasSuccessful() + " ran " + result.getRunCount() + " tests");
    }

}
