package br.com.moveflix.controller;

import br.com.moveflix.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moveflix/movie")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;
}
