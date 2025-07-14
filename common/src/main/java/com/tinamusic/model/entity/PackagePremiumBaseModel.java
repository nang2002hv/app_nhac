package com.tinamusic.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@MappedSuperclass
public class PackagePremiumBaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, nullable = false)
    private String id;

    @Column(name = "package_name", length = 255, nullable = false)
    private String packageName;

    @Column(name = "package_type", length = 255, nullable = false)
    private String packageType;

    @Column(name = "price", length = 64, nullable = false)
    private String price;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    @Column(name = "status", length = 64, nullable = false)
    private String status;
}
