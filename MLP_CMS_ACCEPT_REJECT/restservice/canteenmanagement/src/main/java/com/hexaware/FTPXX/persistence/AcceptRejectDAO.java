package com.hexaware.MLPXX.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLPXX.model.AcceptReject;
/**
 * AcceptRejectDAO class used to fetch data from data base.
 * @author hexware
 */

public interface AcceptRejectDAO {
  /**
    * @return the all the order record.
    */
  @SqlQuery("Select * from orders ")
  @Mapper(AcceptRejectMapper.class)
  List<AcceptReject> show();
   /**
    * @param orderId the orderId
    * @param customerId the customerId
    * @param vendorId the vendorId
    * @param orderStatus the orderStatus
    * @return the updated record.
    */
  @SqlUpdate("Update orders set ORDER_STATUS =(:orderStatus) where ORDER_ID=(:orderId) and CUSTOMER_ID=(:customerId) ")
  @Mapper(AcceptRejectMapper.class)
  int acceptedRejected(@Bind("orderId")int orderId, @Bind ("customerId") int customerId,
        @Bind ("vendorId") int vendorId, @Bind ("orderStatus") String orderStatus);
}
