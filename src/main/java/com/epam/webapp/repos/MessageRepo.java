package com.epam.webapp.repos;

import org.springframework.data.repository.CrudRepository;

import com.epam.webapp.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
