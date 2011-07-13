/**
 * 
 */
package org.wltea.analyzer.lucene;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;

public final class IKAnalyzer extends Analyzer {
	
	private boolean isMaxWordLength = false;

	public IKAnalyzer(){
		this(false);
	}
	

	public IKAnalyzer(boolean isMaxWordLength){
		super();
		this.setMaxWordLength(isMaxWordLength);
	}


	@Override
	public TokenStream tokenStream(String fieldName, Reader reader) {
		return new IKTokenizer(reader , isMaxWordLength());
	}

	public void setMaxWordLength(boolean isMaxWordLength) {
		this.isMaxWordLength = isMaxWordLength;
	}

	public boolean isMaxWordLength() {
		return isMaxWordLength;
	}

}
