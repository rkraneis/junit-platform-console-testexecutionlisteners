Least-effort port of Junit Platform's Console launcher output to be used during
maven builds.

Just add `src/test/resources/META-INF/services/org.junit.platform.launcher.TestExecutionListener`
and enter one of

- `io.github.rkraneis.org.junit.platform.console.tasks.FlatPrintingListener`
- `io.github.rkraneis.org.junit.platform.console.tasks.TreePrintingListener`
- `io.github.rkraneis.org.junit.platform.console.tasks.VerboseTreePrintingListener`

as the contents of the file.

Example output (for `TreePrintingListener` in combination with default `surefire` output):

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running JqwikReportingTest
Tests run: 6, Failures: 6, Errors: 0, Skipped: 0, Time elapsed: 1.491 s <<< FAILURE! - in JqwikReportingTest
Test 2b: AssertionError  Time elapsed: 0.176 s  <<< FAILURE!
java.lang.AssertionError
	at de.rkraneis.jqwiklabs.JqwikReportingTest.Test_2b_AssertionError(JqwikReportingTest.java:35)

Test 1: boolean  Time elapsed: 0.029 s  <<< FAILURE!
org.opentest4j.AssertionFailedError: Property [Test 1: boolean] falsified with sample [5]

Test 3: org.junit.Assert  Time elapsed: 0.033 s  <<< FAILURE!
org.opentest4j.AssertionFailedError: expected: <true> but was: <false>
	at de.rkraneis.jqwiklabs.JqwikReportingTest.Test_3_JunitAssert(JqwikReportingTest.java:44)

Test 4a: org.assertj.core.api.Assertions  Time elapsed: 0.113 s  <<< FAILURE!
java.lang.AssertionError: 

Expecting:
 <5>
to be less than:
 <5> 
	at de.rkraneis.jqwiklabs.JqwikReportingTest.Test_4a_AssertjAssert(JqwikReportingTest.java:52)

Test 2a: assert  Time elapsed: 0.016 s  <<< FAILURE!
java.lang.AssertionError
	at de.rkraneis.jqwiklabs.JqwikReportingTest.Test_2a_assert(JqwikReportingTest.java:26)

Test 4b: org.assertj.core.api.SoftAssert  Time elapsed: 1.117 s  <<< FAILURE!
org.opentest4j.MultipleFailuresError: 
Multiple Failures (1 failure)
	
Expecting:
 <5>
to be less than:
 <5> 
at JqwikReportingTest.lambda$Test_4b_AssertjSoftAssert$0(JqwikReportingTest.java:61)
	at de.rkraneis.jqwiklabs.JqwikReportingTest.Test_4b_AssertjSoftAssert(JqwikReportingTest.java:60)

╷
├─ JQwik Test Engine ✔
│  └─ JqwikReportingTest ✔
│     ├─ Test 2b: AssertionError ✘ java.lang.AssertionError
│     │     2018-10-22T20:33:58.671112 falsified = `[5]`
│     │     2018-10-22T20:33:58.676965
│     │        tries = `1`
│     │        originalSample = `[88]`
│     │        generation-mode = `RANDOMIZED`
│     │        checks = `1`
│     │        seed = `7037043185846814666`
│     │        sample = `[5]`
│     ├─ Test 1: boolean ✘ Property [Test 1: boolean] falsified with sample [5]
│     │     2018-10-22T20:33:58.712178 falsified = `[5]`
│     │     2018-10-22T20:33:58.716743
│     │        tries = `1`
│     │        originalSample = `[623614536]`
│     │        generation-mode = `RANDOMIZED`
│     │        checks = `1`
│     │        seed = `2413337302048675470`
│     │        sample = `[5]`
│     ├─ Test 3: org.junit.Assert ✘ expected: <true> but was: <false>
│     │     2018-10-22T20:33:58.749567 falsified = `[5]`
│     │     2018-10-22T20:33:58.750150
│     │        tries = `1`
│     │        originalSample = `[153]`
│     │        generation-mode = `RANDOMIZED`
│     │        checks = `1`
│     │        seed = `3023193760314940411`
│     │        sample = `[5]`
│     ├─ Test 4a: org.assertj.core.api.Assertions ✘ 
│     │        Expecting:
│     │         <5>
│     │        to be less than:
│     │         <5> 
│     │     2018-10-22T20:33:58.865788 falsified = `[5]`
│     │     2018-10-22T20:33:58.866387
│     │        tries = `1`
│     │        originalSample = `[218]`
│     │        generation-mode = `RANDOMIZED`
│     │        checks = `1`
│     │        seed = `6577868511527045434`
│     │        sample = `[5]`
│     ├─ Test 2a: assert ✘ java.lang.AssertionError
│     │     2018-10-22T20:33:58.881144 falsified = `[5]`
│     │     2018-10-22T20:33:58.882265
│     │        tries = `1`
│     │        originalSample = `[15]`
│     │        generation-mode = `RANDOMIZED`
│     │        checks = `1`
│     │        seed = `840990557170585469`
│     │        sample = `[5]`
│     └─ Test 4b: org.assertj.core.api.SoftAssert ✘ Multiple Failures (1 failure)
│           
│              Expecting:
│               <5>
│              to be less than:
│               <5> 
│              at JqwikReportingTest.lambda$Test_4b_AssertjSoftAssert$0(JqwikReportingTest.java:61)
│           2018-10-22T20:33:59.993639 falsified = `[5]`
│           2018-10-22T20:33:59.996739
│              tries = `1`
│              originalSample = `[833988273]`
│              generation-mode = `RANDOMIZED`
│              checks = `1`
│              seed = `-3911008317885777019`
│              sample = `[5]`
└─ JUnit Jupiter ✔

Results:

Failures: 
  JqwikReportingTest.Test_1_boolean Property [Test 1: boolean] falsified with sample [5]
  JqwikReportingTest.Test_2a_assert:26
  JqwikReportingTest.Test_2b_AssertionError:35
  JqwikReportingTest.Test_3_JunitAssert:44 expected: <true> but was: <false>
  JqwikReportingTest.Test_4a_AssertjAssert:52 
Expecting:
 <5>
to be less than:
 <5> 
  JqwikReportingTest.Test_4b_AssertjSoftAssert:60 Multiple Failures (1 failure)
	
Expecting:
 <5>
to be less than:
 <5> 
at JqwikReportingTest.lambda$Test_4b_AssertjSoftAssert$0(JqwikReportingTest.java:61)

Tests run: 6, Failures: 6, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD FAILURE
------------------------------------------------------------------------
Total time: 5.991 s
Finished at: 2018-10-22T20:34:00+02:00
Final Memory: 15M/64M
------------------------------------------------------------------------
```
