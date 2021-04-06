package com.imnoob.community.mapper;

import com.imnoob.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionMapper {
    int createQuestion(Question question);
    List<Question> findAllQuestions();

    List<Question> findQuestionsById(@Param("id") Long id);

    Question findQuestionById(@Param("id") Integer id);

    int modifiedQuestion(Question question);

    int incView(@Param("id") Long id);
}
