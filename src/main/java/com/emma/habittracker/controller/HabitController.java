package com.emma.habittracker.controller;

import org.springframework.ui.Model;
import com.emma.habittracker.model.Habit;
import com.emma.habittracker.service.HabitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HabitController {
        private final HabitService habitService;

        public HabitController(HabitService habitService) {
            this.habitService = habitService;
        }

        @GetMapping("/")
        public String home(Model model) {
            model.addAttribute("habits", habitService.getAllHabits());
            return "home";
        }

        @PostMapping
        public String addHabit(@RequestParam String name) {
            habitService.addHabit(new Habit(name));
            return "redirect:/";
        }

        @GetMapping("/delete/{id}")
    public String deleteHabit(@PathVariable Long id) {
            habitService.deleteHabit(id);
            return "redirect:/";
        }
}
