package pkg1;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Measurement(iterations = 5)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 3)
public class Bench {

  @Benchmark
  public void codeToBenchmark1() {
    Code.method1(2, 3);
  }

  @Benchmark
  public void codeToBenchmark2() {
    Code.method2(2, 3);
  }

  public static void main(String[] args) throws Exception {
    org.openjdk.jmh.Main.main(args);
  }
}
