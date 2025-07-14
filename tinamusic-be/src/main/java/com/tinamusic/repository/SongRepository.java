package com.tinamusic.repository;

import com.tinamusic.model.entity.SongModel;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends SongBaseRepository<SongModel,String> {

}
