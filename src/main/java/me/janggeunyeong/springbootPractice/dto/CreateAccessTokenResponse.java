package me.janggeunyeong.springbootPractice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateAccessTokenResponse {
    private String accessToken;
}
