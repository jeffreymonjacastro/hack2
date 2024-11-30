package org.dbp.hack2.message.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.dbp.hack2.chat.domain.Chat;

import java.time.ZonedDateTime;

@Data
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "timestamp", nullable = false)
    private ZonedDateTime timestamp;

    @ManyToOne
    private Chat chat;
}
