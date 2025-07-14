package com.tinamusic.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
@Entity(name = "song")
public class SongModel extends SongBaseModel {
    @OneToMany(mappedBy = "song")
    private List<AudioQualityModel> audioQualities;

    @OneToMany(mappedBy = "song")
    private List<ArtistSongModel> artistSongs;

    @OneToMany(mappedBy = "song")
    private List<PlaylistSongModel> playlistSongs;

    @OneToMany(mappedBy = "song")
    private List<InteractionSongModel> interactionSongs;

    @OneToMany(mappedBy = "song")
    private List<GenreSongModel> genreSongs;

}
