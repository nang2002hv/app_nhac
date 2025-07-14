package com.tinamusic.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity(name = "user_access_log")
public class UserAccessLogModel {
    @Id
    @UuidGenerator
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "user_id", length = 36)
    private String userId;

    @Column(name = "access_token", length = 512)
    private String accessToken;

    @Column(name = "ip", length = 45)
    private String ip;

    @Column(name = "user_agent", length = 256)
    private String userAgent;

    @Column(
            name = "last_seen",
            columnDefinition = "DATE NOT NULL DEFAULT (CURRENT_DATE)"
    )
    private LocalDate lastSeen;
}
