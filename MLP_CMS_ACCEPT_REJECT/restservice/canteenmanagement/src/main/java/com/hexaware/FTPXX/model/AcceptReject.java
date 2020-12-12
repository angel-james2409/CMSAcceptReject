package com.hexaware.MLPXX.model;
import java.util.Objects;
/**
* AcceptReject class used to display acceptreject information.
* @author hexware
*/
public class AcceptReject {
/**
* orderId to store orderId.
*/
  private int orderId;
  private int customerId;
  private int vendorId;
  private String orderStatus;
/**
* Default Constructor.
*/

  public AcceptReject() {
  }
/**
 * @param argOrdId to initialize orderId.
 * @param argCusId to initialize customerId.
 * @param argVenId to initialize vendorId.
 * @param argOrdStatus to initialize orderStatus.
 */
  public AcceptReject(final int argOrdId, final int argCusId, final int argVenId, final String argOrdStatus) {
    this.orderId = argOrdId;
    this.customerId = argCusId;
    this.vendorId = argVenId;
    this.orderStatus = argOrdStatus;
  }
  /**
   * Default Constructor.
   * @param i for interger
   */
  public AcceptReject(final int i) {
    this.orderId = i;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    AcceptReject atre = (AcceptReject) obj;
    if (Objects.equals(orderId, atre.orderId) || Objects.equals(customerId, atre.customerId)
        || Objects.equals(vendorId, atre.vendorId) ||  Objects.equals(orderStatus, atre.orderStatus)) {
      return true;
    }
    return false;
  }
  @Override
  public final int hashCode() {
    return Objects.hash(orderId, customerId, vendorId, orderStatus);
  }
    /**
     * @return this Order ID.
     */
  public final int getOrderId() {
    return orderId;
  }
      /**
       * @param argOrdId gets the order id.
       */
  public final void setOrderId(final int argOrdId) {
    this.orderId = argOrdId;
  }
      /**
       * @return this Customer ID.
       */
  public final int getCustomerId() {
    return customerId;
  }
      /**
       * @param argCusId gets the Customer id.
       */
  public final void setCustomerId(final int argCusId) {
    this.customerId = argCusId;
  }
    /**
     * @return this vendor ID.
     */
  public final int getVendorId() {
    return vendorId;
  }
      /**
       * @param argVenId gets the vrndor id.
       */
  public final void setVendorId(final int argVenId) {
    this.vendorId = argVenId;
  }
    /**
       * @return this Order Status.
       */
  public final String getOrderStatus() {
    return orderStatus;
  }
      /**
       * @param argOrdStatus gets the Order Status.
       */
  public final void setOrderStatus(final String argOrdStatus) {
    this.orderStatus = argOrdStatus;
  }
}
