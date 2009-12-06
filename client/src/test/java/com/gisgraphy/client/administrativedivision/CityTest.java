package com.gisgraphy.client.administrativedivision;

import static com.gisgraphy.client.administrativedivision.CityObjectMother.gazeranCity;
import static com.gisgraphy.client.administrativedivision.CityObjectMother.rambouilletCity;
import static com.gisgraphy.client.gisfeature.GisFeatureObjectMother.*;
import org.junit.Assert;
import org.junit.Test;

import com.gisgraphy.client.gisfeature.GeonamesGisFeature;

public class CityTest {

    @Test(expected=IllegalArgumentException.class) public void shouldNotCreateCityWithNullGisFeature() {
	City.forFeature(null);
    }

    @Test(expected=IllegalArgumentException.class) public void shouldNotCreateCityWithGisFeatureThatHasNotParentEntity() {
	City.forFeature(gisfeatureThatDoesNotHaveAnyParentEntity());
    }

    private GeonamesGisFeature gisfeatureThatDoesNotHaveAnyParentEntity() {
	return franceGisFeature();
    }

    @Test public void shouldCompareCitiesByName() {
	Assert.assertTrue(rambouilletCity().compareTo(gazeranCity()) > 0);
	Assert.assertTrue(gazeranCity().compareTo(rambouilletCity()) < 0);
    }

   
    @Test public void twoCitiesWithSameGisFeatureShouldBeEqual() {
	Assert.assertEquals(rambouilletCity(), rambouilletCity());
    }

    @Test public void twoCitiesWithDifferentGisFeaturesShouldNotBeEqual() {
	Assert.assertNotSame(rambouilletCity(), gazeranCity());
    }

    @Test(expected=IllegalArgumentException.class) public void getAdministrativeEntityShouldNotAcceptLevelHigherThanCurrentLevel() {
	rambouilletCity().getAdministrativeEntity(5);
    }

    @Test(expected=IllegalArgumentException.class) public void getAdministrativeEntityShouldNotAcceptLevelLowerThan1() {
	rambouilletCity().getAdministrativeEntity(0);
    }

    @Test public void getAdministrativeEntityShouldAcceptLevelsLessThanOrEqualToCurrentLevel() {
	for (int i = 1; i < 5; i++) {
	    rambouilletCity().getAdministrativeEntity(i);
	}
    }

    @Test public void getAdministrativeEntityShouldDelegateToParentAdministrativeEntity() {
	Assert.assertEquals(rambouilletCity().getAdministrativeEntity(2), rambouilletCity().getParentAdministrativeEntity().getAdministrativeEntity(2));
    }

    @Test public void shouldReturnAdministrativeDivisionLevel() {
	Assert.assertEquals(4, rambouilletCity().getAdminitrativeDivisionLevel());
    }

    @Test public void shouldReturnCountry() {
	Assert.assertEquals(rambouilletCity().getCountry(), CountryObjectMother.france());
    }

    @Test public void shouldReturnCurrency() {
	Assert.assertEquals("EUR", rambouilletCity().getCurrency().getCurrencyCode());
    }

    @Test public void shouldFormatNameUsingSpecifiedFormatter() {

    }
}
