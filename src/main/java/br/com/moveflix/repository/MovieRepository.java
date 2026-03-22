package br.com.moveflix.repository;

import br.com.moveflix.entity.Category;
import br.com.moveflix.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findMovieByCategories(List<Category> categories);
}
