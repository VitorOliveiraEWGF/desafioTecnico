package com.agenda.service;

import com.agenda.repository.LogDataRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LogService {
    private final LogDataRepository logDataRepository;

    public LogService(LogDataRepository logDataRepository) {
        this.logDataRepository = logDataRepository;
    }

    public void processLogFile(MultipartFile file) {
        // Lógica para processar o arquivo de log e salvar os dados no banco de dados
    }
}