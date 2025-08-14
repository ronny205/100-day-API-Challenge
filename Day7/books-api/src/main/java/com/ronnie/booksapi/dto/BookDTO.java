package com.ronnie.booksapi.dto;

import java.util.List;

public class BookDTO {

    private String title;
    private List<String> author;
    private String publisher;
    private String previewLink;

    public BookDTO(String title, List<String> author, String publisher, String previewLink) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.previewLink = previewLink;
    }

    public String getTitle(){
        return title;
    }

    public List<String> getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getPreviewLink(){
        return previewLink;
    }
}
