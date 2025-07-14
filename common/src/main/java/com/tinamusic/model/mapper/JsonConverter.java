package com.tinamusic.model.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;

@Converter
@RequiredArgsConstructor
@Slf4j
public class JsonConverter implements AttributeConverter<List<String>, String> {
    private final ObjectMapper objectMapper;

    @Override
    public String convertToDatabaseColumn(List<String> data) {
        if (data == null)
            return null;

        try {
            return objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            log.error("Failed to convert to database column: ", e);
        }

        return null;
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty())
            return Collections.EMPTY_LIST;

        try {
            return objectMapper.readValue(dbData, List.class);
        } catch (JsonMappingException e) {
            log.error("Failed to convert to entity attribute: ", e);
        } catch (JsonProcessingException e) {
            log.error("Failed to convert to entity attribute: ", e);
        }

        return null;
    }
}