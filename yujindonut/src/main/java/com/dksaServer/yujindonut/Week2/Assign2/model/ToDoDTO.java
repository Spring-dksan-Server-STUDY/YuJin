package com.dksaServer.yujindonut.Week2.Assign2.model;

import javax.persistence.*;

import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class ToDoDTO {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private Date write_date;
    @Column(nullable = false)
    private Boolean completed;
}
