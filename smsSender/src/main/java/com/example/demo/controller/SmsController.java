package com.example.demo.controller;

import com.example.demo.service.SmsRequest;
import com.example.demo.service.TwilioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SmsController {
    public final TwilioService twilioService;

    public SmsController(TwilioService twilioService) {
        this.twilioService = twilioService;
    }

    @PostMapping
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        twilioService.sendSms(smsRequest);
    }
}
