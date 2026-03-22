package br.com.moveflix.controller;

import br.com.moveflix.controller.request.MovieRequest;
import br.com.moveflix.controller.response.MovieResponse;
import br.com.moveflix.entity.Movie;
import br.com.moveflix.mapper.MovieMapper;
import br.com.moveflix.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movieflix/movie")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping
    public ResponseEntity<MovieResponse> save(@RequestBody MovieRequest request) {
        Movie savedMovie = movieService.save(MovieMapper.toMovie(request));
        return  ResponseEntity.ok(MovieMapper.toMovieResponse(savedMovie));
    }

    @GetMapping
    public ResponseEntity<List<MovieResponse>> findAll() {
        return ResponseEntity.ok(movieService.findAll()
                .stream()
                .map(MovieMapper::toMovieResponse)
                .toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieResponse> findById(@PathVariable Long id) {
        return movieService.findById(id)
                    .map(movie -> ResponseEntity.ok(MovieMapper.toMovieResponse(movie)))
                    .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieResponse> atualizar(@RequestBody MovieRequest request, @PathVariable Long id) {
        return movieService.update(id, MovieMapper.toMovie(request))
                .map(movie -> ResponseEntity.ok(MovieMapper.toMovieResponse(movie)))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public ResponseEntity<List<MovieResponse>> findByIdCategory(@RequestParam Long category) {
        return ResponseEntity.ok(movieService.findByCategory(category)
                .stream()
                .map(MovieMapper::toMovieResponse)
                .toList());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (movieService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        movieService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
