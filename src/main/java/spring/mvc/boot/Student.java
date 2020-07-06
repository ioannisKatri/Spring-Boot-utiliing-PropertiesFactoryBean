package spring.mvc.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
//    @Value("#{countryList}")
    @Value("#{${countryOptions}}")
    private Map<String, String> countryOptions;
    private ArrayList<String> favouriteLanguages;
    private String[] operatingSystems;

    public Student() {
        favouriteLanguages = new ArrayList<>();
        favouriteLanguages.add("PHP");
        favouriteLanguages.add("JAVA");
        favouriteLanguages.add("C#");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public ArrayList<String> getFavouriteLanguages() {
        return favouriteLanguages;
    }

    public void setFavouriteLanguages(ArrayList<String> favouriteLanguages) {
        this.favouriteLanguages = favouriteLanguages;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public Map<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(Map<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }
}
