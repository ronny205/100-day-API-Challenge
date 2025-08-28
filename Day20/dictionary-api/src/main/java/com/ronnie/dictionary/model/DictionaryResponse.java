package com.ronnie.dictionary.model;


import java.util.List;

public class DictionaryResponse {
    private String word;
    private String phonetic;
    private List<Meaning> meanings;

    // getters and setters

    public static class Meaning {
        private String partOfSpeech;
        private List<Definition> definitions;

        // getters and setters
    }

    public static class Definition {
        private String definition;
        private String example;

        // getters and setters
    }
}

