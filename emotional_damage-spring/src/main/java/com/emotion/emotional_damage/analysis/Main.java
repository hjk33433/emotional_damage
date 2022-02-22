package com.emotion.emotional_damage.analysis;

public class Main {
    static NlpPipeline nlpPipeline = null;

    public static void processText(String text) {
        nlpPipeline.estimatingSentiment(text);
    }

    public static void main(String[] args) {
        String text = "This is an excellent book. I enjoy reading it. I can read on Sundays. Today is only Tuesday. Can't wait for next Sunday. The working week is unbearably long. It's awful.";
        nlpPipeline  = new NlpPipeline();
        nlpPipeline.init();
        processText(text);
    }
}
