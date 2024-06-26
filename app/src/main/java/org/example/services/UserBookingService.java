package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.example.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService
{
    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();


    private static final String USERS_PATH = "../localDb/users.json";
    public UserBookingService(User user1) throws IOException {
        this.user=user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {}) ;

    }
}
