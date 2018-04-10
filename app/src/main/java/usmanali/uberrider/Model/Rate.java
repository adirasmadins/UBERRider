package usmanali.uberrider.Model;

/**
 * Created by SAJIDCOMPUTERS on 12/4/2017.
 */

public class Rate {
    private  String rates,comments;

    public String getRates() {
        return rates;
    }

    public Rate() {
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Rate(String rates, String comments) {
       this.rates = rates;
        this.comments = comments;
    }
}
