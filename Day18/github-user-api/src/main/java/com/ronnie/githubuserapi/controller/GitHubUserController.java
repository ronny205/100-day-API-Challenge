package com.ronnie.githubuserapi.controller;

import com.ronnie.githubuserapi.model.GitHubUser;
import com.ronnie.githubuserapi.service.GithubUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/github")
public class GitHubUserController {

    private final GithubUserService githubUserService;

    public GitHubUserController (GithubUserService githubUserService) {
        this.githubUserService = githubUserService;
    }

    public GitHubUser getUser(@PathVariable String username) {
        return githubUserService.getUser(username);
    }
}
