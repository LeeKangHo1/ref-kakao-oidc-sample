package com.metacoding.oidcsample.user;

import lombok.Getter;

// 굳이 소문자로 변환 과정이 필요할 경우
@Getter
public enum ProviderEnum {
    LOCAL("local"), KAKAO("kakao"), APPLE("apple");

    ProviderEnum(String value) {
        this.value = value;
    }

    private String value;
}
