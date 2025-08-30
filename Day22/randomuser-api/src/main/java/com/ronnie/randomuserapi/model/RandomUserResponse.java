package com.ronnie.randomuserapi.model;


import lombok.Data;
import java.util.List;

@Data
public class RandomUserResponse {
    private List<Result> results;

    @Data
    public static class Result {
        private Name name;
        private String gender;
        private String email;
        private String phone;

        @Data
        public static class Name {
            private String title;
            private String first;
            private String last;
        }
    }
}

