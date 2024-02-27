package com.aplication.service;

import com.aplication.model.LogData;
import com.aplication.repository.LogDataRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Service

public class LogService {

    private final LogDataRepository logDataRepository;

    public LogService(LogDataRepository logDataRepository) {
        this.logDataRepository = logDataRepository;
    }

    public void processLogFile(MultipartFile file) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            // Lendo todas as linhas do arquivo de log e concatenando em uma única string
            String logContent = reader.lines().collect(Collectors.joining(System.lineSeparator()));

            // Criando uma instância de LogData e configurando o conteúdo do log
            LogData logData = new LogData();
            logData.setLogContent(logContent);

            // Salvando os dados do log no banco de dados
            logDataRepository.save(logData);
        } catch (IOException e) {
            // Lidando com exceções de leitura de arquivo
            e.printStackTrace();
        }
    }
}
