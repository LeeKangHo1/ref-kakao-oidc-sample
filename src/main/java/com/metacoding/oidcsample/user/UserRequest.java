package com.metacoding.oidcsample.user;

import lombok.Data;


public class UserRequest {

    @Data
    public static class LoginDTO {
        private String username;
        private String password;
    }

    @Data
    public static class JoinDTO {
        private String username;
        private String password;
        private String email;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .provider(ProviderEnum.LOCAL)
                    .build();
        }
    }
}
