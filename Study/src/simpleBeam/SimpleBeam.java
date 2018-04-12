package simpleBeam;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.values.PCollection;

public class SimpleBeam {

	public static void main(String[] args) {
		PipelineOptions options = new PipelineOptionsFactory().create();

		Pipeline p = Pipeline.create(options);
		// テキスト読み込み
		PCollection<String> textData = p.apply(TextIO.read().from("textA.txt"));
		// テキスト書き込み
		textData.apply(TextIO.write().to("wordcounts"));
		// Pipeline 実行
		p.run().waitUntilFinish();
	}

}
