package com.hova;

abstract public class KeywordAnalyzer implements TextAnalyzer{

    public KeywordAnalyzer() {
    }


    abstract protected String[] getKeywords();

    abstract protected Label getLabel();

    @Override
    public Label processText(String text) {
        String[] keywords = this.getKeywords();
        Label l = this.getLabel();

        for(String kw: keywords) {
            if (-1 != text.indexOf(kw)) {
                return l;
            }
        }

        return Label.OK;
    }
}
