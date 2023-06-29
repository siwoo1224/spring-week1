package com.example.week_1.dto;

import lombok.Getter;

@Getter
public class BoardRequestDto {
    private String title;       //제목
    private String name;        //이름
    private String contents;    //내용
    private String passwd;      //비밀번호
}
