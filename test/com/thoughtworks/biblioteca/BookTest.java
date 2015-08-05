package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("Title 1", "Author 1", 1);
    }

    @Test
    public void shouldConvertDetailsToString() {
        assertEquals("Title 1 | Author 1 | 1", book.getDetailsAsString());
    }
}