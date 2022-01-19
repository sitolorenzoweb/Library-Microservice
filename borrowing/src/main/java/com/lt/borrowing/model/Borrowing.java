package com.lt.borrowing.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Data
@Document
public class Borrowing {
    @Id
    private String borrowingId;
    @NotBlank(message = "bookId is mandatory")
    private String bookId;
    @NotBlank(message = "customerId is mandatory")
    private String customerId;
    @NotBlank(message = "borrowingDate is mandatory")
    private String borrowingDate;
    @NotBlank(message = "borrowingExpDate is mandatory")
    private String borrowingExpDate;

    public String getBorrowingId() {
        return borrowingId;
    }

    public void setBorrowingId(String borrowingId) {
        this.borrowingId = borrowingId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public String getBorrowingExpDate() {
        return borrowingExpDate;
    }

    public void setBorrowingExpDate(String borrowingExpDate) {
        this.borrowingExpDate = borrowingExpDate;
    }
}
