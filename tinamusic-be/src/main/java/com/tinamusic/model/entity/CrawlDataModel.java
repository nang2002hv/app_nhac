package com.tinamusic.model.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @SuperBuilder
@Entity(name = "crawl_data")
public class CrawlDataModel extends CrawlDataBaseModel {}
