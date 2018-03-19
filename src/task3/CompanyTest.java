package task3;

import java.util.HashMap;
import java.util.Map;

public class CompanyTest {

  // this class needs some changes.
  // try to make as little changes as possible
  public static void main(String[] args) {
    Map<Company, String> companyToOwner = new HashMap<>();

    Company simmoLtd = new Company();
    simmoLtd.setName("simmo ltd");
    companyToOwner.put(simmoLtd, "simmo");

    if (!"simmo".equals(companyToOwner.get(simmoLtd)))
      throw new IllegalStateException("simmo should own simmo ltd");

    Company martLtd = new Company();
    martLtd.setName("mart ltd");
    companyToOwner.put(martLtd, "mart");

    if (!"mart".equals(companyToOwner.get(martLtd)))
      throw new IllegalStateException("mart should own mart ltd");

    Company anonymousCompany = new Company();
    if (companyToOwner.containsKey(anonymousCompany))
      throw new IllegalStateException("anonymous company should have no owner");

    Company simmoLtdClone = new Company();
    simmoLtdClone.setName("simmo ltd");
    if (!"simmo".equals(companyToOwner.get(simmoLtdClone)))
      throw new IllegalStateException("simmo ltd clone should be simmo ltd, too");

    simmoLtd.addCustomer("mart's spaghetty factory");

    if (!"simmo".equals(companyToOwner.get(simmoLtdClone)))
      throw new IllegalStateException("company named 'simmo ltd' should belong to simmo");

    simmoLtd.setName("simmo corp");
    if (!"simmo".equals(companyToOwner.get(simmoLtd)))
      throw new IllegalStateException("simmo should own simmo corp");

    Company simmoCorpClone = new Company();
    simmoCorpClone.setName("simmo corp");
    if (!"simmo".equals(companyToOwner.get(simmoCorpClone)))
      throw new IllegalStateException("simmo corp clone should be simmo corp, too");
  }
}
