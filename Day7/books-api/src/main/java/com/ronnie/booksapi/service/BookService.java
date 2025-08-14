package com.ronnie.booksapi.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ronnie.booksapi.dto.BookDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class BookService {

    private static final String GOOGLE_BOOKS_API_URL =
            "https://www.googleapis.com/books/v1/volumes?q={query}";

    public List<BookDTO> getBookByQuery(String query) {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(GOOGLE_BOOKS_API_URL, String.class, query);

        List<BookDTO> books = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response);
            JsonNode items = root.path("items");

            for (JsonNode item : items) {
                JsonNode volumeInfo = item.path("volumeInfo");

                String title = volumeInfo.path("title").asText();
                List<String> authors = new ArrayList<>();

                if(volumeInfo.has("authors")){
                    Iterator<JsonNode> authorIterator = volumeInfo.path("authors").elements();

                    while (authorIterator.hasNext()) {
                        authors.add(authorIterator.next().asText());
                    }
                }

                String publisher = volumeInfo.path("publisher").asText("");
                String previewLink = volumeInfo.path("previewLink").asText("");

                books.add(new BookDTO(title, authors, publisher, previewLink));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;

    }
}
