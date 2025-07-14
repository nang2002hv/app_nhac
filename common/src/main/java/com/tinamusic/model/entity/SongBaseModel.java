package com.tinamusic.model.entity;

import com.tinamusic.model.enums.SongTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
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
public class SongBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    @Column(name = "image", length = 500)
    private String image;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "lrc_lyrics", length = 500)
    private String lrcLyrics;

    @Column(name = "text_lyrics", columnDefinition = "LONGTEXT")
    private String textLyrics;

    @Column(name = "duration")
    private double duration;

    @Column(name = "url_slug", length = 500, unique = true)
    private String urlSlug;

    @Column(name = "license", length = 500)
    private String license;

    @Column(name ="thumbnail", length = 500)
    private String thumbnail;

    @Column(name = "key_color", length = 7)
    private String keyColor;

    @Column(name = "age_limit")
    private Integer ageLimit;

    @Column(name = "type")
    private SongTypeEnum type;
}
