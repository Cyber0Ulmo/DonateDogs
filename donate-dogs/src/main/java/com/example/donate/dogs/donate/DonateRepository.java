package com.example.donate.dogs.donate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateRepository  extends JpaRepository<Donate, Long> {
}
