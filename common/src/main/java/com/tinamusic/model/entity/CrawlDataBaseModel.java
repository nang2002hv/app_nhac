package com.tinamusic.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.UuidGenerator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class CrawlDataBaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "lyrics", length = 255)
    private String lyrics;

    @Column(name = "lyrics_file_path", length = 255)
    private String lyricsFilePath;

    @Column(name = "source_url", length = 255)
    private String sourceUrl;

    @Column(name = "album", length = 255)
    private String album;

    @Column(name = "song_artist", length = 255)
    private String artists;
}
