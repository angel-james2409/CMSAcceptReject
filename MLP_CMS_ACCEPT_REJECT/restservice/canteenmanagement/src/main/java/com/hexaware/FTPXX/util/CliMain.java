package com.hexaware.MLPXX.util;
import java.util.Scanner;

import com.hexaware.MLPXX.factory.AcceptRejectFactory;
import com.hexaware.MLPXX.factory.MenuFactory;
import com.hexaware.MLPXX.model.AcceptReject;
import com.hexaware.MLPXX.model.Menu;

/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private final Scanner option = new Scanner(System.in, "UTF-8");

  /**
   * mainMenu method used to display the option we had in the application.
   */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. AcceptReject");
    System.out.println("3. Exit");
    mainMenuDetails();
  }

  /**
   * mainMenuDetails method process the option selected from main menu.
   */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      final int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          showFullMenu();
          break;
        case 2:
          acceptRejectResponse();
          break;
        case 3:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2");
      }
    } catch (final Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }

  /**
   * showFullMenu method display the menu item stored in database.
   */
  private void showFullMenu() {
    final Menu[] menu = MenuFactory.showMenu();
    System.out.println("Food_Id" + "\t" + "Food_Name" + "\t" + "Price" + "\t" + "Prepration_Time");
    for (final Menu m : menu) {
      System.out.println(m.getFoodId() + "\t" + m.getFoodName() + "\t" + m.getPrice() + "\t" + m.getPreprationTime());
    }
  }

  private void showOrders() {
    AcceptReject[] acre = AcceptRejectFactory.showOrders();
    System.out.println("ORDER_ID" + "\t" + "CUSTOMER_ID" + "\t" + "VENDOR_ID" + "\t" + "ORDER_STATUS");
    for (AcceptReject ar : acre) {
      System.out.println(ar.getOrderId() + "\t" + ar.getCustomerId() + "\t" + ar.getVendorId() + "\t" + ar.getOrderStatus());
    }
  }
  private void acceptRejectResponse() {
    showOrders();
    int ordId;
    int cusId;
    int venId;
    System.out.println("enter the Order Id");
    ordId = option.nextInt();
    System.out.println("enter the customer Id");
    cusId = option.nextInt();
    System.out.println("enter the vendor Id");
    venId = option.nextInt();

    String y = "Accepted";
    String n = "Rejected";
    System.out.println("accept or reject order");
    String response = option.next().toUpperCase();
    if (response.equals("Y")) {
      System.out.println(" accepted");
      AcceptRejectFactory.acceptOrder(ordId, cusId, venId, y);
    }
    if (response.equals("N")) {
      System.out.println(" rejected");
      AcceptRejectFactory.acceptOrder(ordId, cusId, venId, n);

    }
  }
/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
