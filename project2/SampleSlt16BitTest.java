import org.junit.Assert;
import org.junit.Test;

import static edu.gvsu.dlunit.DLUnit.*;
import static edu.gvsu.dlunit.DLUnit.readPin;

/**
 * Sample test cases for 16-bit set less than circuit
 * <p/>
 * IMPORTANT:  These test cases do *not* thoroughly test the circuit.  You need to
 * re-name this class and add more tests!
 * <p/>
 * Created by kurmasz on 8/8/16.
 */
public class SampleSlt16BitTest {

  public void verify(long a, long b, boolean signed) {

    if (signed) {
      setPinSigned("InputA", a);
      setPinSigned("InputB", b);
    } else {
      setPinUnsigned("InputA", a);
      setPinUnsigned("InputB", b);
    }

    setPin("Signed", signed);
    run();


    ////////////////////////////////////////
    //
    // Check the correctness of the output
    //
    ///////////////////////////////////////
    String message = String.format("%d < %d (%s): ", a, b, signed ? "signed" : "unsigned");
    Assert.assertEquals("Output " + message, a < b, readPin("LessThan"));
  }

  @Test
  public void zero_zero_signed() {
    verify(0, 0, true);
  }

  @Test
  public void zero_one_signed() {
    verify(0, 1, true);
  }

  @Test
  public void one_zero_signed() {
    verify(1, 0, true);
  }

  @Test
  public void zero_negone_signed() {
    verify(0, -1, true);
  }

  @Test
  public void negone_zero_signed() {
    verify(-1, 0, true);
  }

  @Test
  public void neg_neg_signed() {
    verify(-32767, -32767, true);
  }

  @Test
  public void pos_pos_signed() {
    verify(32000, 32000, true);
  }

  @Test
  public void one_negone_signed() {
    verify(1, -1, true);
  }

  @Test
  public void negone_one_signed() {
    verify(-1, 1, true);
  }

  @Test
  public void zero_zero_unsigned() {
    verify(0, 0, false);
  }

  @Test
  public void zero_one_unsigned() {
    verify(0, 1, false);
  }

  @Test
  public void one_zero_unsigned() {
    verify(1, 0, false);
  }

  @Test
  public void neg_neg_unsigned() {
    verify(500, 1500, false);
  }

  @Test
  public void all() {
    verify(-32768, 32767, true);
    verify(32767, -32768, true);
    verify(32767, 32767, true);
    verify(-32768, -32768, true);
    verify(65535, 65535, false);
    verify(0, 65535, false);
    verify(65535, 0, false);
  }

  @Test 
  public void failure() {
    verify(-32768, 1, true);
  }

  // @Test
  // public void looperSigned() {
  //   for (int i=-32768; i < 32767; i++) {
  //     for (int j=-32768; j < 32767; j++) {
  //       verify2(i, j, true);
  //     }
  //   }
  // }
  @Test
  public void max() {
    verify(65535, 65535, false);
  }

  @Test
  public void max1() {
    verify(65535, 1, false);
    //tester();
  }

  // public void tester() {
  //       System.out.println("STarting");
  //       long startForLoops = System.nanoTime();
  //       for (int i = -32768; i < 32767; i += 1000) {
  //           for (int j = -32768; j < 32767; j += 1000) {
  //               // Do nothing
  //           }
  //       }
  //       long endForLoops = System.nanoTime();
  //       long durationForLoops = endForLoops - startForLoops;
  //       System.out.println("half way");
  //       long startVerify = System.nanoTime();
  //       for (int i = -32768; i < 32767; i += 1000) {
  //           for (int j = -32768; j < 32767; j += 1000) {
  //               verify2(i, j, true);
  //           }
  //       }
  //       long endVerify = System.nanoTime();
  //       long durationVerify = endVerify - startVerify;

  //       printer("Duration of for loops: " + durationForLoops / 1000000000 + " seconds");
  //       printer("Duration of verify2 function: " + durationVerify / 100000000 + " seconds");
  //   }

    public void printer(String out) {
      System.out.println(out);
    }

  // @Test
  // public void looperUnsigned() {
  //   for (int i=0; i < 65535; i += 1000) {
  //     for (int j=0; j < 65535; j += 1000) {
  //       verify2(i, j, false);
  //     }
  //   }
  // }

  public void verify2(long a, long b, boolean signed) {

    if (signed) {
      setPinSigned("InputA", a);
      setPinSigned("InputB", b);
    } else {
      setPinUnsigned("InputA", a);
      setPinUnsigned("InputB", b);
    }

    setPin("Signed", signed);
    run();


    ////////////////////////////////////////
    //
    // Check the correctness of the output
    //
    ///////////////////////////////////////
    String message = String.format("%d < %d (%s): ", a, b, signed ? "signed" : "unsigned");
    // Assert.assertEquals("Output " + message, a < b, readPin("LessThan"));
    if (!(a < b == readPin("LessThan"))) {
      System.out.println(message);
    }
  }

  @Test
  public void pos_pos_unsigned() {
    verify(1, 65535, false);
  }
}