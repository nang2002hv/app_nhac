package com.tinamusic.model.entity;

import com.tinamusic.model.enums.RankingTypeEnum;
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
public class SongRankingBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    /*
     * The `period` field stores the ranking period as an integer (`INT`).
     * The `period` format varies based on the ranking type:
     *  - WEEKLY  (Weekly ranking)  -> YYYYWW  (Year + Week number)      -> e.g., 202413 (Week 13 of 2024)
     *  - MONTHLY (Monthly ranking) -> YYYYMM  (Year + Month)            -> e.g., 202404 (April 2024)
     *  - YEARLY  (Yearly ranking)  -> YYYY    (Year only)               -> e.g., 2024   (Full year 2024)
     *
     * When inserting data:
     *  - Weekly ranking  -> period = Year * 100 + WeekOfYear (e.g., 202413)
     *  - Monthly ranking -> period = Year * 100 + Month      (e.g., 202404)
     *  - Yearly ranking  -> period = Year                   (e.g., 2024)
     */
    @Column(name = "period", nullable = false)
    private int period;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ranking_type", nullable = false)
    private RankingTypeEnum rankingType;

    @Column(name = "position", nullable = false)
    private int position;

    @Column(name = "total_listens")
    private Long totalListens;

    @Column(name = "total_likes")
    private Long totalLikes;

    @Column(name = "total_shares")
    private Long totalShares;

    @Column(name = "total_downloads")
    private Long totalDownloads;

    @Column(name = "total_added_to_playlists")
    private Long totalAddedToPlaylists;
}
