package com.gisgraphy.client.language;

import com.gisgraphy.client.language.Iso639Language;

public class IsoLanguageObjectMother {

    public static Iso639Language frenchIsoLanguage() {
	return Iso639Language.isoLanguage("Français").withAlpha3("fra").withAlpha2Code("fr");
    }
    
    public static Iso639Language englishIsoLanguage() {
	return Iso639Language.isoLanguage("English").withAlpha3("eng").withAlpha2Code("en");
    }
    
    public static Iso639Language spanishIsoLanguage() {
	return Iso639Language.isoLanguage("Spanish").withAlpha3("spa").withAlpha2Code("es");
    }
    
    public static Iso639Language hawaiianIsoLanguage() {
	return Iso639Language.isoLanguage("Hawaiian").withAlpha3("haw");
    }
    
    public static Iso639Language ghotuo() {
	return Iso639Language.isoLanguage("Ghotuo").withAlpha3("aaa");
    }
}
