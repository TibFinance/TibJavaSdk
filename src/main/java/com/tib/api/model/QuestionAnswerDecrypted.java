
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class QuestionAnswerDecrypted   {

    
    /**
 * Gets or sets the question.
 */
    @JsonProperty("Question")
    private String question;

    /**
 * Gets or sets the answer.
 */
    @JsonProperty("Answer")
    private String answer;


    
    public QuestionAnswerDecrypted() {
    }

    
    public QuestionAnswerDecrypted(String question, String answer) {
        this.question = question;
this.answer = answer;

    }
    
    

    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionAnswerDecrypted that = (QuestionAnswerDecrypted) o;
        return Objects.equals(question, that.question) && Objects.equals(answer, that.answer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    @Override
    public String toString() {
        return "QuestionAnswerDecrypted{" +
                 "question='" + question + '\'' +
 ", answer='" + answer + '\'' +

                '}';
    }
}