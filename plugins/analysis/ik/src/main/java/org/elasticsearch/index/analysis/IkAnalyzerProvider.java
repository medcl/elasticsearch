package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.Analyzer;


public class IkAnalyzerProvider implements AnalyzerProvider {

    private Analyzer analyzer;


    public IkAnalyzerProvider() {
        analyzer = new IkAnalyzer();
    }


    @Override
    public String name() {
        return "ik";
    }

    @Override
    public AnalyzerScope scope() {
        return AnalyzerScope.INDEX;
    }


    @Override
    public Analyzer get() {
        return analyzer;
    }
}
