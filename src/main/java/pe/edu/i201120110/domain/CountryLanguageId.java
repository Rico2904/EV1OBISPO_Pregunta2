package pe.edu.i201120110.domain;

import java.io.Serializable;
import java.util.Objects;

public class CountryLanguageId implements Serializable {
    private String CountryCode;
    private String Language;

    // Constructor vacío
    public CountryLanguageId() {}

    // Constructor con argumentos
    public CountryLanguageId(String CountryCode, String Language) {
        this.CountryCode = CountryCode;
        this.Language = Language;
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

    // Sobrescribe equals() y hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return Objects.equals(CountryCode, that.CountryCode) &&
                Objects.equals(Language, that.Language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CountryCode, Language);
    }
}
