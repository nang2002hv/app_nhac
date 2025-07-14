package com.tinamusic.model.entity;

import com.tinamusic.model.enums.AudioQualityTypeEnum;
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
public class AudioQualityBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    @Column(name = "url", length = 500)
    private String url;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    private AudioQualityTypeEnum type;
}
