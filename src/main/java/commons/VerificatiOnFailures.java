package commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.ITestResult;

public class VerificatiOnFailures extends HashMap<ITestResult, List<Throwable>> {
    private static final long serialVersionUID = 1L;
    private static VerificatiOnFailures failures;
    private VerificatiOnFailures() {
        super();
	}

	public static VerificatiOnFailures getFailures() {
		if (failures == null) {
			failures = new VerificatiOnFailures();
		}
		return failures;
	}

	public List<Throwable> getFailuresForTest(ITestResult result) {
		List<Throwable> exceptions = get(result);
		return exceptions == null ? new ArrayList<Throwable>() : exceptions;
	}

	public void addFailureForTest(ITestResult result, Throwable throwable) {
		List<Throwable> exceptions = getFailuresForTest(result);
		exceptions.add(throwable);
		put(result, exceptions);
	}

}
