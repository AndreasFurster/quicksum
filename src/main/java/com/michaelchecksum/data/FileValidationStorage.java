package com.michaelchecksum.data;

import com.michaelchecksum.domain.FileValidationResult;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FileValidationStorage {
    private Database database;

    public FileValidationStorage(){
        this.database = new Database();
    }

    public void add(FileValidationResult result) {
        try {
            PreparedStatement statement = database.getConnection().prepareStatement("INSERT INTO validation_result (user_id, hash_type, hash, file_name, validated) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, 1);
            statement.setInt(2, result.getHashType().getValue());
            statement.setString(3, result.getHash());
            statement.setString(4, result.getFile().getName());
            statement.setBoolean(5, result.getSuccess());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}