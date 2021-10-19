package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TwilioService {
    private final TwilioSmsSender twilioSmsSender;

    public TwilioService(TwilioSmsSender twilioSmsSender) {
        this.twilioSmsSender = twilioSmsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        twilioSmsSender.sendSms(smsRequest);
    }

}
