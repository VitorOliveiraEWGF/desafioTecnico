package com.aplication.repository;

import com.aplication.model.LogData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogDataRepository extends JpaRepository<LogData, Long> {
}