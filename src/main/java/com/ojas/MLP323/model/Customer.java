package com.ojas.MLP323.model;
import java.util.Objects;
/**
 * Customer class used to display customer information.
 * @author ojas
 */
public class Customer {
/**
 * customerId to store customerId.
 * customerName to initialize customerName.
 * customerEmail to initialize customerEmail.
 * customerAddress to initialize customerAddresss.
 * customerMobileNo to initialize customerMobileNo.
 * customerPassword to initialize customerPassword.
 * walletName to initialize walletName.
 * walletAmount to initialize walletAmount.
 */
  private int customerId;
  private String customerName;
  private String customerEmail;
  private String customerAddress;
  private String customerMobileNo;
  private String customerPassword;
  private String walletName;
  private double walletAmount;
  /**
   * Default Constructor.
   */
  public Customer() {
  }

  /**
   * Default Constructor.
   */
  public Customer(final int id) {
    this.customerId = id;
  }

  /**
   * @param argCustomerId to initialize customerId.
   * @param argCustomerName to initialize customerName.
   * @param argCustomerEmail to initialize customerEmail.
   * @param argCustomerAddress to initialize customerAddresss.
   * @param argCustomerMobileNo to initialize customerMobileNo.
   * @param argCustomerPassword to initialize customerPassword.
   * @param argWalletName to initialize walletName.
   * @param argWalletAmount to initialize walletAmount.
   */
  public Customer(final int argCustomerId,
          final String argCustomerName,
          final String argCustomerEmail,
          final String argCustomerAddress,
          final String argCustomerMobileNo,
          final String argCustomerPassword,
          final String argWalletName,
          final double argWalletAmount) {
    this.customerId = argCustomerId;
    this.customerName = argCustomerName;
    this.customerEmail = argCustomerEmail;
    this.customerAddress = argCustomerAddress;
    this.customerMobileNo = argCustomerMobileNo;
    this.customerPassword = argCustomerPassword;
    this.walletName = argWalletName;
    this.walletAmount = argWalletAmount;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Customer customer = (Customer) obj;
    if (Objects.equals(customerId, customer.customerId)
        && Objects.equals(customerName, customer.customerName)
        && Objects.equals(customerEmail, customer.customerEmail)
        && Objects.equals(customerAddress, customer.customerAddress)
        && Objects.equals(customerMobileNo, customer.customerMobileNo)
        && Objects.equals(customerPassword, customer.customerPassword)
        && Objects.equals(walletName, customer.walletName)
        && Objects.equals(walletAmount, customer.walletAmount)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(customerId, customerName, customerEmail, customerAddress, customerMobileNo, customerPassword, walletName, walletAmount);
  }
    /**
     * @return this customer ID.
     */
  public final int getCustomerId() {
    return customerId;
  }
    /**
     * @param argCustomerId gets the customer id.
     */
  public final void setCustomerId(final int argCustomerId) {
    this.customerId = argCustomerId;
  }
    /**
     * @return this customer Name.
     */
  public final String getCustomerName() {
    return customerName;
  }
    /**
     * @param argCustomerName gets the customer Name.
     */
  public final void setCustomerName(final String argCustomerName) {
    this.customerName = argCustomerName;
  }
    /**
     * @return this customer Email.
     */
  public final String getCustomerEmail() {
    return customerEmail;
  }
    /**
     * @param argCustomerEmail gets the customer Email.
     */
  public final void setCustomerEmail(final String argCustomerEmail) {
    this.customerEmail = argCustomerEmail;
  }
    /**
     * @return this customer Address.
     */
  public final String getCustomerAddress() {
    return customerAddress;
  }
    /**
     * @param argCustomerAddress gets the customer Address.
     */
  public final void setCustomerAddress(final String argCustomerAddress) {
    this.customerAddress = argCustomerAddress;
  }
    /**
     * @return this customer MobileNo.
     */
  public final String getCustomerMobileNo() {
    return customerMobileNo;
  }
    /**
     * @param argCustomerMobileNo gets the customer MobileNo.
     */
  public final void setCustomerMobileNo(final String argCustomerMobileNo) {
    this.customerMobileNo = argCustomerMobileNo;
  }
    /**
     * @return this customer Password.
     */
  public final String getCustomerPassword() {
    return customerPassword;
  }
    /**
     * @param argCustomerPassword gets the customer Password.
     */
  public final void setCustomerPassword(final String argCustomerPassword) {
    this.customerPassword = argCustomerPassword;
  }
    /**
     * @return this customer walletName.
     */
  public final String getWalletName() {
    return walletName;
  }
    /**
     * @param argWalletName gets the customer walletName.
     */
  public final void setWalletName(final String argWalletName) {
    this.walletName = argWalletName;
  }
    /**
     * @return this customer walletAmount.
     */
  public final double getWalletAmount() {
    return walletAmount;
  }
    /**
     * @param argWalletAmount gets the customer walletAmount.
     */
  public final void setWalletAmount(final double argWalletAmount) {
    this.walletAmount = argWalletAmount;
  }
}

