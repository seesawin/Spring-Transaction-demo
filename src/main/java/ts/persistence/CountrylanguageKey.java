package ts.persistence;

import java.io.Serializable;

public class CountrylanguageKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.CountryCode
     *
     * @mbggenerated Fri May 05 17:41:12 CST 2017
     */
    private String countrycode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.Language
     *
     * @mbggenerated Fri May 05 17:41:12 CST 2017
     */
    private String language;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table countrylanguage
     *
     * @mbggenerated Fri May 05 17:41:12 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.CountryCode
     *
     * @return the value of countrylanguage.CountryCode
     *
     * @mbggenerated Fri May 05 17:41:12 CST 2017
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.CountryCode
     *
     * @param countrycode the value for countrylanguage.CountryCode
     *
     * @mbggenerated Fri May 05 17:41:12 CST 2017
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.Language
     *
     * @return the value of countrylanguage.Language
     *
     * @mbggenerated Fri May 05 17:41:12 CST 2017
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.Language
     *
     * @param language the value for countrylanguage.Language
     *
     * @mbggenerated Fri May 05 17:41:12 CST 2017
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}