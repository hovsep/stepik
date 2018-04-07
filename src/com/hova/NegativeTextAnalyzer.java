package com.hova;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    @Override
    protected String[] getKeywords() {
        String[] kw = {":(","=(", ":|"};
        return kw;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
