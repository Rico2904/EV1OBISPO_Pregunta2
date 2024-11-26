package pe.edu.i201120110.domain;

import jakarta.persistence.*;

@Entity
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
    private String CountryCode;
    @Id
    private String Language;
    private String IsOfficial;
    private Double Percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(String countryCode, String language) {
        CountryCode = countryCode;
        Language = language;
    }

    public CountryLanguage(String countryCode, String language, String isOfficial, Double percentage) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }

    // Getters y Setters
    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String IsOfficial) {
        this.IsOfficial = IsOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double Percentage) {
        this.Percentage = Percentage;
    }
}
