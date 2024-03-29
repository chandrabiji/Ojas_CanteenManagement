package com.ojas.MLP323.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.ojas.MLP323.model.Vendor;

import org.skife.jdbi.v2.StatementContext;
/**
 * MenuMapper class used to fetch menu data from database.
 * @author ojas
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped Vendor object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Vendor
       */
    return new Vendor(rs.getInt("vendor_id"),
    rs.getString("vendor_name"),
    rs.getString("vendor_email"),
    rs.getString("vendor_contact"),
    rs.getString("vendor_address"),
    rs.getString("vendor_password"),
    rs.getDouble("vendor_ratings")
    );

  }
}

