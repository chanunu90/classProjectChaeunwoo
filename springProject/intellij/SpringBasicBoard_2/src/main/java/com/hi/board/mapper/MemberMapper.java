package com.hi.board.mapper;

import com.hi.board.domain.member.MemberDTO;
import com.hi.board.domain.member.MemberRegistRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    MemberDTO selectByUidPw(String uid, String pw);
    
    // 회원의 존재 여부 확인
    @Select("select count(*) from member where uid=#{uid}")
//    @Select("select count(*) from member where uid=#{uid}")
    int selectCountByUid(String uid);

    // insert
    int insertMember(MemberRegistRequest registRequest);

}
