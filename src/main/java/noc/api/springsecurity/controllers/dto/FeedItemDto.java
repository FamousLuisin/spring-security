package noc.api.springsecurity.controllers.dto;

public record FeedItemDto(long tweetId, String content, String username) {
}
