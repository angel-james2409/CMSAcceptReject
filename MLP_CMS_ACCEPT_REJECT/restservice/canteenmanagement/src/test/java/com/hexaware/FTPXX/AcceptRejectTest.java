
package com.hexaware.MLPXX.model;



import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import mockit.integration.junit4.JMockit;

/**
 * Test class for Menu.
 */

@RunWith(JMockit.class)
public class AcceptRejectTest {
  private static final double DELTA = 1e-15;
/**.
 * setup method
 */
  @Before
    public void initInput() {

  }
/**.
 * Test the equals/hascode methods of menu
 */
  @Test
public final void testAcceptOrReject() {
    AcceptReject acre = new AcceptReject(101, 1, 10, "accepted");
    acre.setOrderId(101);
    assertEquals(101, acre.getOrderId());
    acre.setCustomerId(1);
    assertEquals(1, acre.getCustomerId());
    acre.setVendorId(10);
    assertEquals(10, acre.getVendorId());
    acre.setOrderStatus("accepted");
    assertEquals("accepted", acre.getOrderStatus());
    assertEquals(acre, new AcceptReject(101, 1, 10, "accepted"));
    assertEquals(acre.hashCode(), new AcceptReject(101, 1, 10, "accepted").hashCode());
  }
}
