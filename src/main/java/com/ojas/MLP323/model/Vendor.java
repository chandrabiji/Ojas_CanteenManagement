package com.ojas.MLP323.model;
import java.util.Objects;
/**
 * Vendor class used to display customer information.
 * @author hexware
 */
public class Vendor {
/**
 * vendorId to store vendorId.
 * vendorName to store vendorName.
 * vendorEmail to store vendorEmail.
 * vendorContactNo to store vendorContactNo.
 * vendorAddress to store vendorAddress.
 * vendorPassword to store vendorPassword.
 */
  public int vendorId;
  public String vendorName;
  public String vendorEmail;
  public String vendorContactNo;
  public String vendorAddress;
  public String vendorPassword;
  public double vendorRatings;


  /**
   * Default Constructor.
   */
  public Vendor() {
  }
  /**
   * @param argVendorId to initialize vendor id.
   * @param argVendorName to initialize vendorName.
   * @param argVendorEmail to initialize vendorEmail.
   * @param argVendorContactNo to initialize vendorContactNo.
   * @param argVendorAddress to initialize vendorAddress.
   * @param argVendorPassword to initialize vendorPassword.
   */
  public Vendor(final int argVendorId,
        final String argVendorName,
        final String argVendorEmail,
        final String argVendorContactNo,
        final String argVendorAddress,
        final String argVendorPassword) {
    this.vendorId = argVendorId;
    this.vendorName = argVendorName;
    this.vendorEmail = argVendorEmail;
    this.vendorContactNo = argVendorContactNo;
    this.vendorAddress = argVendorAddress;
    this.vendorPassword = argVendorPassword;
  }


  /**
   * @param argVendorId to initialize vendor id.
   * @param argVendorName to initialize vendorName.
   * @param argVendorEmail to initialize vendorEmail.
   * @param argVendorContactNo to initialize vendorContactNo.
   * @param argVendorAddress to initialize vendorAddress.
   * @param argVendorPassword to initialize vendorPassword.
   */
  public Vendor(final int argVendorId,
        final String argVendorName,
        final String argVendorEmail,
        final String argVendorContactNo,
        final String argVendorAddress,
        final String argVendorPassword,
        final double vendorRatings) {
    this.vendorId = argVendorId;
    this.vendorName = argVendorName;
    this.vendorEmail = argVendorEmail;
    this.vendorContactNo = argVendorContactNo;
    this.vendorAddress = argVendorAddress;
    this.vendorPassword = argVendorPassword;
    this.vendorRatings=vendorRatings;
  }

  public Vendor(final int i){
    this.vendorId=i;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Vendor vendor = (Vendor) obj;
    if (Objects.equals(vendorId, vendor.vendorId)
        && Objects.equals(vendorName, vendor.vendorName)
        && Objects.equals(vendorEmail, vendor.vendorEmail)
        && Objects.equals(vendorContactNo, vendor.vendorContactNo)
        && Objects.equals(vendorAddress, vendor.vendorAddress)
        && Objects.equals(vendorPassword, vendor.vendorPassword)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(vendorId, vendorName, vendorEmail, vendorContactNo, vendorAddress, vendorPassword);
  }
    /**
     * @return vendorId.
     */
  public final int getVendorId() {
    return vendorId;
  }
    /**
     * @param argVendorId gets the vendor id.
     */
  public final void setVendorId(final int argVendorId) {
    this.vendorId = argVendorId;
  }
    /**
     * @return vendorName.
     */
  public final String getVendorName() {
    return vendorName;
  }
    /**
     * @param argVendorName gets the vendor Name.
     */
  public final void setVendorName(final String argVendorName) {
    this.vendorName = argVendorName;
  }
    /**
     * @return vendorEmail.
     */
  public final String getVendorEmail() {
    return vendorEmail;
  }
    /**
     * @param argVendorEmail gets the vendor Email.
     */
  public final void setVendorEmail(final String argVendorEmail) {
    this.vendorEmail = argVendorEmail;
  }
    /**
     * @return vendorContactNo.
     */
  public final String getVendorContactNo() {
    return vendorContactNo;
  }
    /**
     * @param argVendorContactNo gets the vendor ContactNo.
     */
  public final void setVendorContactNo(final String argVendorContactNo) {
    this.vendorContactNo = argVendorContactNo;
  }
    /**
     * @return vendorAddress.
     */
  public final String getVendorAddress() {
    return vendorAddress;
  }
    /**
     * @param argVendorAddress gets the vendor Address.
     */
  public final void setVendorAddress(final String argVendorAddress) {
    this.vendorAddress = argVendorAddress;
  }
    /**
     * @return vendorPassword.
     */
    public final String getVendorPassword() {
      return vendorPassword;
    }
      /**
       * @param argVendorPassword gets the vendor Password.
       */
    public final void setVendorPassword(final String argVendorPassword) {
      this.vendorPassword = argVendorPassword;
    }


    public final double getVendorRatings() {
      return vendorRatings;
    }
      /**
       * @param argVendorPassword gets the vendor Password.
       */
    public final void setVendorRatings(final double vendorRatings) {
      this.vendorRatings = vendorRatings;
    }
}
