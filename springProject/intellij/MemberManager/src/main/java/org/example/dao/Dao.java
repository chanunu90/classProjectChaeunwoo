package org.example.dao;

import org.example.domain.Member;

public interface Dao {

    void insert(Member member);

    void update(Member member);

    Member selectByEmail(String email);
}