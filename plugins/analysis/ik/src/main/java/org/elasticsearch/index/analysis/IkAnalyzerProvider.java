package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.Analyzer;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;
import org.wltea.analyzer.dic.Dictionary;
import org.wltea.analyzer.lucene.IKAnalyzer;


public class IkAnalyzerProvider extends AbstractIndexAnalyzerProvider<IKAnalyzer> {
    private final IKAnalyzer analyzer;
    @Inject
    public IkAnalyzerProvider(Index index, @IndexSettings Settings indexSettings, String name, Settings settings) {
        super(index, indexSettings, name, settings);
        analyzer=new IKAnalyzer(settings);
    }

    @Override
    public String name() {
        return "ik";
    }

    @Override
    public AnalyzerScope scope() {
        return AnalyzerScope.INDEX;
    }


    @Override public IKAnalyzer get() {
        return this.analyzer;
    }
}
