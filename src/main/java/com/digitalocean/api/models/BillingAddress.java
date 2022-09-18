package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * The BillingAddress model.
 */
@Fluent
public class BillingAddress {
    /*
     * Street address line 1
     */
    @JsonProperty(value = "address_line1")
    private String addressLine1;

    /*
     * Street address line 2
     */
    @JsonProperty(value = "address_line2")
    private String addressLine2;

    /*
     * City
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * Region
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * Postal code
     */
    @JsonProperty(value = "postal_code")
    private String postalCode;

    /*
     * Country (ISO2) code
     */
    @JsonProperty(value = "country_iso2_code")
    private String countryIso2Code;

    /*
     * Timestamp billing address was created
     */
    @JsonProperty(value = "created_at")
    private String createdAt;

    /*
     * Timestamp billing address was updated
     */
    @JsonProperty(value = "updated_at")
    private String updatedAt;

    /**
     * Get the addressLine1 property: Street address line 1.
     * 
     * @return the addressLine1 value.
     */
    public String getAddressLine1() {
        return this.addressLine1;
    }

    /**
     * Set the addressLine1 property: Street address line 1.
     * 
     * @param addressLine1 the addressLine1 value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get the addressLine2 property: Street address line 2.
     * 
     * @return the addressLine2 value.
     */
    public String getAddressLine2() {
        return this.addressLine2;
    }

    /**
     * Set the addressLine2 property: Street address line 2.
     * 
     * @param addressLine2 the addressLine2 value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get the city property: City.
     * 
     * @return the city value.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Set the city property: City.
     * 
     * @param city the city value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the region property: Region.
     * 
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: Region.
     * 
     * @param region the region value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the postalCode property: Postal code.
     * 
     * @return the postalCode value.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: Postal code.
     * 
     * @param postalCode the postalCode value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the countryIso2Code property: Country (ISO2) code.
     * 
     * @return the countryIso2Code value.
     */
    public String getCountryIso2Code() {
        return this.countryIso2Code;
    }

    /**
     * Set the countryIso2Code property: Country (ISO2) code.
     * 
     * @param countryIso2Code the countryIso2Code value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setCountryIso2Code(String countryIso2Code) {
        this.countryIso2Code = countryIso2Code;
        return this;
    }

    /**
     * Get the createdAt property: Timestamp billing address was created.
     * 
     * @return the createdAt value.
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: Timestamp billing address was created.
     * 
     * @param createdAt the createdAt value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the updatedAt property: Timestamp billing address was updated.
     * 
     * @return the updatedAt value.
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: Timestamp billing address was updated.
     * 
     * @param updatedAt the updatedAt value to set.
     * @return the BillingAddress object itself.
     */
    public BillingAddress setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
