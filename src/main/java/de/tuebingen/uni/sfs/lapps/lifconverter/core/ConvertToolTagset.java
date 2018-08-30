/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuebingen.uni.sfs.lapps.lifconverter.core;

import de.tuebingen.uni.sfs.lapps.lifconverter.exceptions.VocabularyMappingException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author felahi
 */
@Deprecated
public class ConvertToolTagset {

    private String convertedTagSet = null;
    private Map<String, String> convertedVocabularies = new HashMap<String, String>();

    public ConvertToolTagset(String tcftagSet, String lifVocabulary, String tcfVocabulary) {
        this.convertedTagSet=tcftagSet;
        this.convertedVocabularies.put(lifVocabulary, tcfVocabulary);
    }

    public void addValues(String key, String value) throws VocabularyMappingException {
        this.convertedVocabularies.put(key, value);
    }

    public String getConvertedVocabularies(String key) throws VocabularyMappingException {
        if (convertedVocabularies.containsKey(key)) {
            return convertedVocabularies.get(key);
        } else {
            throw new VocabularyMappingException("The conversion failed for " + key + " to tcf");
        }
    }

    public Map<String, String> getConvertedVocabularies() {
        return convertedVocabularies;
    }

    public String getConvertedTagSet() {
        return convertedTagSet;
    }
}