package task3;

import java.util.ArrayList;
import java.util.List;

/*
 * This class has a very fundamental problem that makes it
 * unsuitable for a hashmap key. Some functionality must be
 * removed to make it work reliably.
 */
public class Company {

  private String name;
  private List<String> customerNames = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addCustomer(String name) {
    customerNames.add(name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Company other = (Company) o;
    return name.equals(other.name) && customerNames.equals(other.customerNames);
  }
}
