package com.phillipapa.analytics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {
    @GetMapping("/analysis")
    public String analyticsResult() {
        return "Cek log kafka untuk hasil analytics.";
    }
}
