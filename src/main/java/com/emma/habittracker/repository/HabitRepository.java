package com.emma.habittracker.repository;

import com.emma.habittracker.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit, Long> {

}
