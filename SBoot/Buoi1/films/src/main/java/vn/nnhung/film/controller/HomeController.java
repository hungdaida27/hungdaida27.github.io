package vn.nnhung.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.nnhung.film.model.Film;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping()
    public String showHomePage(Model model){
        model.addAttribute("name","Hung");
        return  "index";
    }

    @GetMapping("about")
    public String showAboutPage(Model model){
        model.addAttribute("name","Hung");
        return  "about";
    }

    @GetMapping("films")
    public String listFilm(Model model){
        List<Film> films = List.of(
                new Film("Fast & Furious 9", "Phim hành động", "Justin Lin", 2021),
                new Film("Tư Đằng", "Phim ngôn tình", "Chưa xác định", 2021),
                new Film("Người Phán Xử", "Phim hành động", "Nguyễn Mai Hiền", 2017),
                new Film("Tây Du Kí", "Phim Hài", "Dương Khiết", 1986),
                new Film("Sống chung với mẹ chồng", "Phim hành động", "ĐTH Việt Nam", 2016)
        );
        model.addAttribute("films",films);
        return  "film";
    }
}
