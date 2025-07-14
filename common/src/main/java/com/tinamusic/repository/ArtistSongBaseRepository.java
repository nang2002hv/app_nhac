package com.tinamusic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtistSongBaseRepository<T, ID> extends JpaRepository<T, ID> {
}
