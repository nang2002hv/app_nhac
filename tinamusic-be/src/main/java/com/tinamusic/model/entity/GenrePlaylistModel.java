package com.tinamusic.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity(name = "genre_playlist")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"genre_id", "playlist_id"})})
public class GenrePlaylistModel extends GenrePlaylistBaseModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id", nullable = false)
    private GenreModel genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlist_id", nullable = false)
    private PlaylistModel playlist;
}
