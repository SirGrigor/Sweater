package com.example.sweater.demo.repository;

import com.example.sweater.demo.domain.Message;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface MessageRepository extends CrudRepository<Message, Long> {
   List<Message> findByTag(String tag);
}
