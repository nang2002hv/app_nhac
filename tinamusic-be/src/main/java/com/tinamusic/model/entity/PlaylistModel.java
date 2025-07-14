package com.tinamusic.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity(name = "playlist")
public class PlaylistModel extends PlayListBaseModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel user;

    @OneToMany(mappedBy = "playlist")
    private List<GenrePlaylistModel> genrePlaylists;

    @OneToMany(mappedBy = "playlist")
    private List<ArtistPlaylistModel> artistPlaylists;

    @OneToMany(mappedBy = "playlist")
    private List<PlaylistSongModel> playlistSongs;

    @OneToMany(mappedBy = "playlist")
    private List<InteractionPlaylistModel> interactionPlaylists;
}
