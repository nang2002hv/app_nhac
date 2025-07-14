package com.tinamusic.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tinamusic.model.enums.GenreEnum;
import jakarta.persistence.*;
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
public class GenreBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    @Column(name = "name", length = 64, nullable = false, unique = true)
    private String name;

    @JsonIgnore
    @Column(name = "image", length = 500)
    private String image;

    @Column(name ="name_en")
    private String nameEn;

    @Column(name ="name_vi")
    private String nameVi;

    @Column(name ="name_lo")
    private String nameLo;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "url_slug", length = 100, unique = true)
    private String urlSlug;

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private GenreEnum type;

    @JsonIgnore
    @Column(name ="thumbnail", length = 500)
    private String thumbnail;
}
