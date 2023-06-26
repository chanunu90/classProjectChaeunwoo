package org.zerock.b52.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.b52.dto.MemberReadDTO;

public interface MemberMapper {

  MemberReadDTO selectOne(String email);
  
  @Select("select now()")
  String getTime();

  @Insert("insert into tbl_member (email,mpw, mname) values (#{email}, #{mpw}, #{mname})")
  int insertMember(
      @Param("email") String email, 
      @Param("mpw") String mpw, 
      @Param("mname")String mname);
  
  @Insert("insert into tbl_member_role (email, rolename) values (#{email}, #{rolename})")
  int insertMemberRole(
    @Param("email") String email,
    @Param("rolename") String rolename
  );    
}
