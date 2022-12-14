package dto;

import java.util.ArrayList;
import java.util.List;

public class AuthorDTO {
    private Long authorId;
    private String name;
    private List<BookDTO> books = new ArrayList<>();

    public AuthorDTO() { }

    public Long getId() {
        return authorId;
    }

    public void setId(Long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookDTO> getBooks() {
        return books;
    }

    public void setBooks(List<BookDTO> books) {
        this.books = books;
    }
}