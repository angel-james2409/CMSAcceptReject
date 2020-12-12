package com.hexaware.MLPXX.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
/**
 * foodId to store foodId.
 */
  private int foodId;
  private String foodName;
  private int price;
  private int preprationTime;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize FoodId
 * @param argFoodName to initialize foodName.
 * @param argPrice to initialize Price.
 * @param argPreprationTime to initialize PreprationTime
 * used to get details through constructor.
 */
  public Menu(final int argFoodId, final String argFoodName, final int argPrice, final int argPreprationTime) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
    this.price = argPrice;
    this.preprationTime = argPreprationTime;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId) || Objects.equals(foodName, menu.foodName)
           || Objects.equals(price, menu.price) || Objects.equals(preprationTime, menu.preprationTime)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId, foodName, price, preprationTime);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
    /**
     * @return this foodName
     */
  public final String getFoodName() {
    return foodName;
  }
    /**
     * @param argFoodName gets the foodName.
     */
  public final void setFoodName(final String argFoodName) {
    this.foodName = argFoodName;
  }
    /**
     * @return this price.
     */
  public final int getPrice() {
    return price;
  }
    /**
     * @param argPrice gets the price.
     */
  public final void setPrice(final int argPrice) {
    this.price = argPrice;
  }
    /**
     * @return this PreprationTime.
     */
  public final int getPreprationTime() {
    return preprationTime;
  }
    /**
     * @param argPreprationTime gets the PreprationTime.
     */
  public final void setPreprationTime(final int argPreprationTime) {
    this.preprationTime = argPreprationTime;
  }
}
