package com.hova;

import javax.xml.soap.Text;

public class Test {

    public static void main(String[] args) {

    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        for(TextAnalyzer ta : analyzers) {
            Label l = ta.processText(text);
            if (Label.OK != l) {
                return l;
            }
        }

        return Label.OK;
    }
}
