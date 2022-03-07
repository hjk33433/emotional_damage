package com.emotion.emotional_damage.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emotionController {


    //TODO 用户ip+ 时间 -> token +文字-> 检查token 分析文字 ->返回建议文字 ->vue页面新建 显示结果
    @PostMapping("/query")
    public String emotion(@RequestParam("queryText") String queryText) {
        //TODO 分析文本 关键字 统计
        //TODO 根据统计 对应 分类关键字
        //TODO 查询 相关数据
        return queryText;
    }
}
