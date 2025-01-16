package com.ohhoonim.exercise_springdata.para;

import org.junit.Test;

/*
```plantuml
@startuml
skinparam monochrome reverse

title PARA 분류하기

state Inbox : 분류할 노트 

[*] --> Inbox : note

state PARA {
    state hasDeadline <<entryPoint>>
    state isJob <<entryPoint>>
    state withInterest <<entryPoint>>
    state Project : 기한 내 완성해야 할 노트 목록
    state Area : 메인 업무. 회사업무 등 
    state Resource : 관심있는 주제들. 취미활동 등 
    state Archive : 보관할 Project, Area, Resource

    hasDeadline --> Project : 프로젝트로 분류
    Project --> [*] : 폐기

    isJob --> Area : Area로 분류
    Area --> Resource : 관심사 변경
    Area --> Archive : 보관

    withInterest --> Resource : Resource로 분류
    Resource --> Area : 관심사 변경 
    Resource --> Archive : 보관
    Archive --> Area : 활성화
    Archive --> Resource : 활성화 
    Archive --> [*] : 폐기
}

Inbox --> hasDeadline 
Inbox --> isJob
Inbox --> withInterest

PARA --> [*] : Note 삭제 

@enduml
```
 */




public class ParaTest {
    
    @Test
    public void note() {
            }
}
