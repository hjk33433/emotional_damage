package com.emotion.emotional_damage.controller;

import com.emotion.emotional_damage.analysis.NlpPipeline;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emotionController {
    static NlpPipeline nlpPipeline = null;

    public static void processText(String text) {
        nlpPipeline.estimatingSentiment(text);
    }

    //TODO 用户ip+ 时间 -> token +文字-> 检查token 分析文字 ->返回建议文字 ->vue页面新建 显示结果
    @PostMapping("/query")
    public String emotion(@RequestParam("queryText") String queryText){
        //TODO 生成token
        //TODO 分析文字
        String text = "This is an excellent book. I enjoy reading it. I can read on Sundays. Today is only Tuesday. Can't wait for next Sunday. The working week is unbearably long. It's awful.";
        nlpPipeline  = new NlpPipeline();
        nlpPipeline.init();
        processText(text);
        return "";
    }

    public static void main(String[] args) {
        String text = "I was scolded by my boss.";
        nlpPipeline  = new NlpPipeline();
        nlpPipeline.init();
        processText(text);
    }
}
