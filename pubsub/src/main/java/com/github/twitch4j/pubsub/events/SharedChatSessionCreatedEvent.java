package com.github.twitch4j.pubsub.events;

import com.github.twitch4j.pubsub.domain.SharedChatSession;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.ApiStatus;

import java.time.Instant;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class SharedChatSessionCreatedEvent extends SharedChatPubSubEvent {
    @ApiStatus.Internal
    public SharedChatSessionCreatedEvent(String channelId, Instant timestamp, SharedChatSession session) {
        super(channelId, timestamp, session);
    }
}
