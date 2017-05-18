package de.nava.boot.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import de.nava.boot.model.Customer;

@Repository
public class CustomerRepository {

   @Autowired
   private JdbcTemplate jdbcTemplate;

   public void save(Customer customer) {
      jdbcTemplate.batchUpdate("INSERT INTO customers (first_name, last_name) VALUES (?,?)",
            Arrays.asList(customer), 5, (ps, customer1) -> {
               ps.setString(1, customer1.getFirstName());
               ps.setString(2, customer1.getLastName());
            });
   }

   public List<Customer> findByLastName(String lastName) {
      return jdbcTemplate.query(
            "SELECT id, first_name, last_name FROM customers WHERE last_name = ?", new Object[] { lastName },
            (rs, rowNum) -> new Customer(rs.getLong("id"),
                  rs.getString("first_name"),
                  rs.getString("last_name")));
   }

   public List<Customer> findAll() {
      return jdbcTemplate.query(
            "SELECT id, first_name, last_name FROM customers",
            (rs, rowNum) -> new Customer(rs.getLong("id"),
                  rs.getString("first_name"),
                  rs.getString("last_name")));
   }
}
