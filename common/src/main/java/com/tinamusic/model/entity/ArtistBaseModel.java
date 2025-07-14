package com.tinamusic.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinamusic.model.enums.ArtistTypeEnum;
import com.tinamusic.model.enums.CheckArtistEmum;
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
public class ArtistBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    @Column(name = "stage_name", length = 64, nullable = false)
    private String stageName;

    @Column(name = "image", length = 500)
    private String image;

    @Column(name = "avatar", length = 500)
    private String avatar;

    @Column(name = "biography", length = 1000)
    private String biography;

    @Column(name ="thumbnail", length = 500)
    private String thumbnail;

    @Column(name = "debut_date")
    private LocalDate debutDate;

    @Column(name = "url_slug", length = 500)
    private String urlSlug;

    @Column(name = "company", length = 250)
    private String company;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    private ArtistTypeEnum type;

    @Column(name = "check_artist")
    private CheckArtistEmum checkArtist;

    @Column(name = "is_verify")
    @JsonProperty("isVerify")
    private boolean isVerify;
}
