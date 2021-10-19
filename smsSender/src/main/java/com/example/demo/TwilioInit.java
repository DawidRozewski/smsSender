package com.example.demo;

import com.twilio.Twilio;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log
public class TwilioInit {

    private final TwilioConfiguration twilioConfiguration;

    public TwilioInit(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(twilioConfiguration.getAccountSid(),
                    twilioConfiguration.getToken());

    }
}
