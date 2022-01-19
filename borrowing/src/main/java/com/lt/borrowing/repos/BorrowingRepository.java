package com.lt.borrowing.repos;

import com.lt.borrowing.model.Borrowing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface BorrowingRepository  extends MongoRepository<Borrowing, String> {
}
