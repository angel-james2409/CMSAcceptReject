package com.hexaware.MLPXX.factory;
import com.hexaware.MLPXX.persistence.AcceptRejectDAO;
import com.hexaware.MLPXX.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLPXX.model.AcceptReject;
/**
 * MenuFactory class used to fetch Orders data from database.
 * @author hexware
 */

public class AcceptRejectFactory {
/**
   *  Protected constructor.
   */
  protected AcceptRejectFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static AcceptRejectDAO dao() {
    final DbConnection db = new DbConnection();
    return db.getConnect().onDemand(AcceptRejectDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of acre object.
   */
  public static AcceptReject[] showOrders() {
    final List<AcceptReject> acre = dao().show();
    return acre.toArray(new AcceptReject[acre.size()]);

  }
  /**
   * @param orderId orderId
   * @param customerId customerId
   * @param vendorId vendorId
   * @param orderStatus orderStatus
   * @return returns
   */
  public static int acceptOrder(final int orderId, final int customerId, final int vendorId, final String orderStatus) {
    final int check = dao().acceptedRejected(orderId, customerId, vendorId, orderStatus);
    return check;
  }
}
