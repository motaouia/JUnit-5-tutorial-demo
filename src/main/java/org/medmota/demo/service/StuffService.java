package org.medmota.demo.service;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.medmota.demo.repository.StuffRepository;

public class StuffService {

	private StuffRepository stuffRepository;

    public StuffService(StuffRepository stuffRepository) {
        this.stuffRepository = stuffRepository;
    }

    public List<String> getStuffWithLengthLessThanFive() {
        try {
            return stuffRepository.getStuff().stream()
                    .filter(stuff -> stuff.length() < 5)
                    .collect(Collectors.toList());
        } catch (SQLException e) {
            return Arrays.asList();
        }
    }
}
