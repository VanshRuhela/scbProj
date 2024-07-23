package com.scbsena.demo.controller;
import com.scbsena.demo.service.FinancialAdvisoryService;
import com.scbsena.demo.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/advisory")
public class FinancialAdvisoryController {

    @Autowired
    private FinancialAdvisoryService financialAdvisoryService;

    @Autowired
    private OpenAIService openAIService;

    @GetMapping("/getAdvice")
    public String getFinancialAdvice(@RequestBody String query) throws Exception {
        System.out.println(query);
       return openAIService.search(query);
    }
}