package me.janggeunyeong.springbootPractice.config;

import me.janggeunyeong.springbootPractice.config.jwt.JwtProperties;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JasyptConfigTest {

    @Autowired
    JwtProperties jwtProperties;

    @Test
    void jasypt() {
        String key = jwtProperties.getSecretKey();

        System.out.printf("%s -> %s", key, jasyptEncoding(key));
    }

    public String jasyptEncoding(String value) {
        String key = "key";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }

}