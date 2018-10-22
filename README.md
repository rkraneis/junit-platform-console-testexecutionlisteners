Least-effort port of Junit Platform's Console launcher output to be used during
maven builds.

Just add `src/test/resources/META-INF/services/org.junit.platform.launcher.TestExecutionListener`
and enter one of

- `io.github.rkraneis.org.junit.platform.console.tasks.FlatPrintingListener`
- `io.github.rkraneis.org.junit.platform.console.tasks.TreePrintingListener`
- `io.github.rkraneis.org.junit.platform.console.tasks.VerboseTreePrintingListener`

as the contents of the file.
