package com.gisgraphy.client.domain;

import static com.gisgraphy.client.domain.GisFeatureGeography.gisFeatureGeography;

/**
 *
 * @author christophe
 */
public class GisFeatureObjectMother {
    public static final String ANTARCTICA_FEATURE_CLASS = "A";
    public static final String ANTARCTICA_FEATURE_CODE = "PCLI";
    public static final long ANTARCTICA_FEATURE_ID = 661485L;
    public static final String ANTARCTICA_FEATURE_NAME = "Antarctica";
    public static final double ANTARCTICA_LATITUDE = 0.0;
    public static final double ANTARCTICA_LONGITUDE = 0.0;
    public static final long ANTARCTICA_POPULATION = 0L;
    
    public static final String FRANCE_FEATURE_CODE = "PCLI";
    public static final long FRANCE_FEATURE_ID = 3017382L;
    public static final String FRANCE_FEATURE_NAME = "France";
    public static final String FRANCE_FEATURE_CLASS = "A";
    public static final double FRANCE_LONGITUDE = 2.0;
    public static final double FRANCE_LATITUDE = 46.0;
    public static final long FRANCE_POPULATION = 64094000L;

    public static final String US_OUTLYING_ISLANDS_FEATURE_CLASS = "A";
    public static final String US_OUTLYING_ISLANDS_FEATURE_CODE = "ADMD";
    public static final long US_OUTLYING_ISLANDS_FEATURE_ID = 5854968L;
    public static final String US_OUTLYING_ISLANDS_FEATURE_NAME = "United States Minor Outlying Islands";
    public static final long US_OUTLYING_ISLANDS_GTOPO30 = -9999L;
    public static final double US_OUTLYING_ISLANDS_LONGITUDE = -162.072494506836;
    public static final double US_OUTLYING_ISLANDS_LATITUDE = 5.88111019134521;
    public static final long US_OUTLYING_ISLANDS_POPULATION = 0L;

    /**
     *
     * @return
     */
    public static GisFeature franceGisFeature() {
        return GisFeature.gisFeature()
                .featureId(FRANCE_FEATURE_ID)
                .name(GisFeatureName.name(FRANCE_FEATURE_NAME))
                .type(new GisFeatureType(FRANCE_FEATURE_CLASS,FRANCE_FEATURE_CODE))
                .geography(
                    GisFeatureGeography.gisFeatureGeography(FRANCE_LONGITUDE, FRANCE_LATITUDE)
                    .population(FRANCE_POPULATION)
                    .build())
                .build();
    }

    public static GisFeature antarcticaGisFeature() {
        return GisFeature.gisFeature()
                .featureId(ANTARCTICA_FEATURE_ID)
                .name(GisFeatureName.name(ANTARCTICA_FEATURE_NAME))
                .type(new GisFeatureType(ANTARCTICA_FEATURE_CLASS,ANTARCTICA_FEATURE_CODE))
                .geography(
                    GisFeatureGeography.gisFeatureGeography(ANTARCTICA_LONGITUDE,ANTARCTICA_LATITUDE)
                    .population(ANTARCTICA_POPULATION)
                    .build())
                .build();
    }

    /**
     *
     * @return
     */
    public static GisFeature usOutlyingIslandsGisFeature() {
        return GisFeature.gisFeature()
                .featureId(US_OUTLYING_ISLANDS_FEATURE_ID)
                .name(GisFeatureName.name(US_OUTLYING_ISLANDS_FEATURE_NAME))
                .type(new GisFeatureType(US_OUTLYING_ISLANDS_FEATURE_CLASS,US_OUTLYING_ISLANDS_FEATURE_CODE))
                .geography(
                    GisFeatureGeography.gisFeatureGeography(US_OUTLYING_ISLANDS_LONGITUDE, US_OUTLYING_ISLANDS_LATITUDE)
                    .population(US_OUTLYING_ISLANDS_POPULATION)
                    .gtopo30AverageElevation(US_OUTLYING_ISLANDS_GTOPO30)
                    .build())
                .build();
    }
    
    public static GisFeature rambouilletAdm4GisFeature() {
	return GisFeature.gisFeature()
		.featureId(6444057L)
		.name(GisFeatureName.name("Rambouillet").withAsciiName("Rambouillet"))
		.type(new GisFeatureType("A", "ADM4"))
		.geography(
			gisFeatureGeography(new Double("1.8333332538604736"), new Double("48.650001525878906"))
			.population(0L)
			.build())
		.build();
    }
    
    public static GisFeature arrondissementDeRambouilletAdm3GisFeature() {
	return GisFeature.gisFeature()
		.featureId(2984512L)
		.name(GisFeatureName.name("Rambouillet").withAsciiName("Rambouillet"))
		.type(new GisFeatureType("A", "ADM3"))
		.geography(
			gisFeatureGeography(new Double("1.9166667461395264"), new Double("48.58333206176758"))
			.population(0L)
			.build())
		.build();
    }
    
    public static GisFeature yvelinesAdm2GisFeature() {
	return GisFeature.gisFeature()
		.featureId(2967196L)
		.name(GisFeatureName.name("Département des Yvelines").withAsciiName("Departement des Yvelines"))
		.type(new GisFeatureType("A", "ADM2"))
		.geography(
			gisFeatureGeography(new Double("1.8666666746139526"), new Double("48.78333282470703"))
			.population(1411761L)
			.gtopo30AverageElevation(104L)
			.build())
		.build();
    }
    
    public static GisFeature ileDeFranceAdm1GisFeature() {
	return GisFeature.gisFeature()
		.featureId(3012874L)
		.name(GisFeatureName.name("Région Île-de-France").withAsciiName("Region Ile-de-France"))
		.type(new GisFeatureType("A", "ADM1"))
		.geography(
			gisFeatureGeography(new Double("2.5"), new Double("48.5"))
			.population(11341257L)
			.build())
		.build();
    }
}
