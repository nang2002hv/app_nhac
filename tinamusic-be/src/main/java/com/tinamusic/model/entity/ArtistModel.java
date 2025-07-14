package com.tinamusic.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity(name = "artist")
public class ArtistModel extends ArtistBaseModel {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", unique = true)
    private UserModel user;

    @OneToMany(mappedBy = "artist")
    List<ArtistSongModel> artistSongs;

    @OneToMany(mappedBy = "artist")
    List<ArtistPlaylistModel> artistPlaylists;

    @OneToMany(mappedBy = "artist")
    List<InteractionArtistModel> interactionArtists;
}
