package com.tinamusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/song")
public class SongController {
    @GetMapping
    public String getSong() {
        return "This is a song endpoint";
    }
}
