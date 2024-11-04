package Immutable;
import java.util.Date;

public final class ImmutableClass {
      // Step 2: Make all fields private and final
      private final String name;
      private final int age;
      private final Date dob;  // Mutable field, will need a defensive copy
  
      // Step 4: Initialize fields via constructor
      public ImmutableClass(String name, int age, Date dob) {
          this.name = name;
          this.age = age;
          // Create a defensive copy of the mutable Date object
          this.dob = new Date(dob.getTime());
      }
  
      // Step 5: Provide only getters, no setters
      public String getName() {
          return name;
      }
  
      public int getAge() {
          return age;
      }
  
      // Return a defensive copy to ensure immutability
      public Date getDob() {
          return new Date(dob.getTime());
      }
}
