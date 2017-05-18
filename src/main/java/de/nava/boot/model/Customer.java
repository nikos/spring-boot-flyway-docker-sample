package de.nava.boot.model;

public class Customer {

   private final Long id;
   private final String firstName;
   private final String lastName;

   public Customer(String firstName, String lastName) {
      this(null, firstName, lastName);
   }

   public Customer(Long id, String firstName, String lastName) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public Long getId() {
      return id;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   @Override
   public String toString() {
      return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s']",
            id, firstName, lastName);
   }

}
