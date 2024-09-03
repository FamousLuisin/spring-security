package noc.api.springsecurity.controllers.dto;

public record LoginResponse(String acessToken, Long expiresIn) {
}
