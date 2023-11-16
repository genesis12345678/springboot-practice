package me.janggeunyeong.springbootPractice.service;

import lombok.RequiredArgsConstructor;
import me.janggeunyeong.springbootPractice.domain.RefreshToken;
import me.janggeunyeong.springbootPractice.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken){
        return refreshTokenRepository.findByRefreshToken(refreshToken).orElseThrow(
                ()-> new IllegalArgumentException("Unexpected token"));
    }
}
