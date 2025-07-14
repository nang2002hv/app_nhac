package com.tinamusic.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Entity(name = "genre")
public class GenreModel extends GenreBaseModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private GenreModel parentGenre;

    @OneToMany(mappedBy = "parentGenre")
    private List<GenreModel> subGenres;

    @JsonIgnore
    @OneToMany(mappedBy = "genre")
    private List<GenreSongModel> genreSongs;

    @JsonIgnore
    @OneToMany(mappedBy = "genre")
    private List<GenrePlaylistModel> genrePlaylists;

}
