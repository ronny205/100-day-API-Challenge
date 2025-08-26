package com.ronnie.githubuserapi.service;

import com.ronnie.githubuserapi.model.GitHubUser;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubUserService {
    private static final String GITHUB_API_URL = "https://api.github.com/users/{username}";

    public GitHubUser getUser(String username) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(GITHUB_API_URL, GitHubUser.class);

    }
}
