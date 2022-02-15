package com.isa.bookcase.service;

import com.isa.bookcase.dto.BookForm;
import com.isa.bookcase.entities.BookEntity;
import com.isa.bookcase.model.Category;
import com.isa.bookcase.repository.Dao;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class BookService {

    private Dao<BookEntity> bookDao;

    public Collection<BookEntity> getAllBooks() {
        // FixMe
        return List.of();
    }

    public List<Category> getBookCategories() {
        return Arrays.asList(Category.values());
    }

    public void addBook(BookForm bookForm) {
        // FixMe
    }
}
