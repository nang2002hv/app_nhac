package com.tinamusic.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinamusic.model.enums.PlaylistTypeEnum;
import jakarta.persistence.*;
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
@MappedSuperclass
public class PlayListBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    protected String id;

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    @Column(name = "image", length = 500)
    private String image;

    @Column(name = "url_slug", length = 500, unique = true)
    private String urlSlug;

    @JsonProperty("isPublic")
    @Column(name = "is_public", columnDefinition = "boolean default true")
    private boolean isPublic;

    @Column(name = "description", length = 2000)
    private String description;

    @Column(name = "thumbnail", length = 500)
    private String thumbnail;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Enumerated(EnumType.ORDINAL)
    private PlaylistTypeEnum type;
}
