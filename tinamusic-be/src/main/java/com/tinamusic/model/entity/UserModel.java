package com.tinamusic.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Entity(name = "user")
public class UserModel extends UserBaseModel {
    @OneToOne(mappedBy = "user")
    private ArtistModel artist;

    @OneToMany(mappedBy = "user")
    private List<PlaylistModel> playLists;

    @OneToMany(mappedBy = "user")
    private List<InteractionSongModel> songInteractionCounts;

    @OneToMany(mappedBy = "user")
    private List<InteractionPlaylistModel> playlistInteractionCounts;

    @OneToMany(mappedBy = "user")
    private List<InteractionArtistModel> artistInteractionCounts;

    @OneToMany(mappedBy = "user")
    private List<UserLoginHistoryModel> userLoginHistories;
}
