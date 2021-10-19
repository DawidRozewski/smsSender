package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class SmsRequest {
    private final String phoneNumber;
    private final String message;
}
