package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import com.mysite.sbb.question.Question;
import jakarta.persistence.*;
import com.mysite.sbb.user.SiteUser;
import java.util.Set;
import jakarta.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter;

}
