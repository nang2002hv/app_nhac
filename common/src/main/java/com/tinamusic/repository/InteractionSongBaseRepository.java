package com.tinamusic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InteractionSongBaseRepository<T, ID> extends JpaRepository<T, ID> {
}
