package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser
    private Object User;
    private Object ArrayList;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
       return apiService.getUsers();


    }


    public void generateRandomUser() {
        apiService.generateRandomUser();


    }



    public void deleteUser(User user) {
        apiService.deleteUser(user);


    }


}


