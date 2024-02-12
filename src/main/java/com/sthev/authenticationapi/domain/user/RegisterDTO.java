package com.sthev.authenticationapi.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
