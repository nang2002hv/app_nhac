package com.tinamusic.model.entity;

import com.tinamusic.model.enums.InteractionTypeEnum;
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
public class InteractionPlaylistBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    @Column(name = "interaction_count", columnDefinition = "int default 0")
    private int interactionCount;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "action_type")
    private InteractionTypeEnum actionType;
}
