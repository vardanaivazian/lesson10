package lesson10;

public class TaxiDriver extends Driver {
    private String taxiCompany;

    public TaxiDriver(String name, int age, String car, String taxiCompany) {
        super(name, age, car);
        this.taxiCompany = taxiCompany;
    }

    public String getTaxiCompany() {
        return taxiCompany;
    }

    public void setTaxiCompany(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }
}
