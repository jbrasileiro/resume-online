package org.owlsource.resume.online.entity;

import java.util.List;

public final class Book {

    private String name;
    private String edition;
    private List<Author> authors;
    private Long year;
    private Long pages;
    private String isbn13;
    private String isbn10;

    public String getName() {
        return name;
    }

    public void setName(
        final String name) {
        this.name = name;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(
        final String edition) {
        this.edition = edition;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(
        final List<Author> authors) {
        this.authors = authors;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(
        final Long year) {
        this.year = year;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(
        final Long pages) {
        this.pages = pages;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(
        final String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(
        final String isbn10) {
        this.isbn10 = isbn10;
    }
}
