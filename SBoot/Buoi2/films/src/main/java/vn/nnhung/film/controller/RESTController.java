package vn.nnhung.film.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.nnhung.film.model.Film;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class RESTController {
    
    @GetMapping("/films")
    public ResponseEntity<List<Film>> listFilms() {
        List<Film> films = List.of(
                new Film("Fast & Furious 9", "Phim hành động", "Justin Lin", 2021),
                new Film("Tư Đằng", "Phim ngôn tình", "Chưa xác định", 2021),
                new Film("Người Phán Xử", "Phim hành động", "Nguyễn Mai Hiền", 2017),
                new Film("Tây Du Kí", "Phim Hài", "Dương Khiết", 1986),
                new Film("Sống chung với mẹ chồng", "Phim hành động", "ĐTH Việt Nam", 2016)
        );
        return ResponseEntity.ok().body(films);
    }
}
