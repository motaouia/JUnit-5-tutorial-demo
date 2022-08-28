package org.medmota.demo.repository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class StuffRepository {
	
	public List<String> getStuff() throws SQLException {
        // Execute Query

        // Return results
        return Arrays.asList("One", "Two", "Three");
    }

}
