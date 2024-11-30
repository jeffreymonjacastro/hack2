package org.dbp.hack2.chat.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.dbp.hack2.user.domain.User;

import java.time.ZonedDateTime;

@Data
@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chat_name", nullable = false)
    private String chatName;

    @Column(name = "date_creation", nullable = false)
    private ZonedDateTime dateCreation;

    @ManyToOne
    private User user;
}
