package com.emma.habittracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.DialectOverride;

import java.time.LocalDate;

@Entity
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int streak;
    private LocalDate lastCompleted;

    public Habit() {}

    public Habit(String name) {
        this.name = name;
        this.streak = 0;
        this.lastCompleted = null;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getStreak() { return streak; }
    public void setStreak(int streak) { this.streak = streak; }

    public LocalDate getLastCompleted() { return lastCompleted; }
    public void setLastCompleted(LocalDate lastCompleted ) { this.lastCompleted = lastCompleted; }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Habit)) return false;
        Habit habit = (Habit) o;
        return id != null && id.equals(habit.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
