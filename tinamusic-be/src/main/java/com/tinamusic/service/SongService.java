package com.tinamusic.service;

import com.tinamusic.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SongService {
    private final SongRepository songRepository;
}
