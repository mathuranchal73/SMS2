package com.sms.questionservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.questionservice.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
