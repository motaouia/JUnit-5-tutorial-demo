package org.medmota.demo.service;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.medmota.demo.repository.StuffRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StuffServiceTest {

	@Mock
	private StuffRepository stuffRepository;

	@InjectMocks
	StuffService stuffService;

	@Test
	void testSuccess() {
		// Setup mock scenario
		try {
			Mockito.when(stuffRepository.getStuff()).thenReturn(Arrays.asList("A", "B", "CDEFGHIJK", "12345", "1234"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Execute the service that uses the mocked repository
		List<String> stuff = stuffService.getStuffWithLengthLessThanFive();

		// Validate the response
		Assertions.assertNotNull(stuff);
		Assertions.assertEquals(3, stuff.size());
	}

	@Test
	void testException() {
		// Setup mock scenario
		try {
			Mockito.when(stuffRepository.getStuff()).thenThrow(new SQLException("Connection Exception"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Execute the service that uses the mocked repository
		List<String> stuff = stuffService.getStuffWithLengthLessThanFive();

		// Validate the response
		Assertions.assertNotNull(stuff);
		Assertions.assertEquals(0, stuff.size());
	}
}
