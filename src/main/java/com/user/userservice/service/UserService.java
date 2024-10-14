package com.user.userservice.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.user.userservice.model.AccountDetails;
import com.user.userservice.model.UserDetails;

@Service
public class UserService {
	public List<UserDetails> getAllUsers() {

        UserDetails user1 = new UserDetails(3235, "john", "6474729899", "1234567890", 30, "johncn", "john123",
                List.of(new AccountDetails("JOHN CURRRAN", "365027332671", "SAVING")
                        , new AccountDetails("JOHN CURRRAN", "365027332671", "CURRENT")));

        UserDetails user2 = new UserDetails(9546, "Smith", "4623642828", "5439854674", 41, "smithkn", "smith619",
                List.of(new AccountDetails("Smith ken", "8272389200", "SAVING")));

        return Stream.of(user1, user2).collect(Collectors.toList());
    }

    public UserDetails getUser(int id) {
        return getAllUsers().stream().filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User Not Found."));
    }
}
