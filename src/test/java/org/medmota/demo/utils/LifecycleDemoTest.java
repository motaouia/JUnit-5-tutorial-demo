package org.medmota.demo.utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifecycleDemoTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Connect to the database");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("Load the schema");
	}

	@Test
	void testOne() {
		System.out.println("Test One");
	}

	@Test
	void testTwo() {
		System.out.println("Test Two");
	}

	@AfterEach
	void afterEach() {
		System.out.println("Drop the schema");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("Disconnect from the database");
	}

}
