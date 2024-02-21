package com.agenda.repository;

import com.agenda.model.LogData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogDataRepository extends JpaRepository<LogData, Long> {
}