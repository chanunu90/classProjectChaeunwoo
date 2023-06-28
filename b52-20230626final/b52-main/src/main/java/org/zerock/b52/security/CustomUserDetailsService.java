package org.zerock.b52.security;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;
import org.zerock.b52.dto.MemberDTO;
import org.zerock.b52.dto.MemberReadDTO;
import org.zerock.b52.mappers.MemberMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService{

  private final MemberMapper memberMapper;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    
    log.info("----------------------------");
    log.info("loaduser..." + username);
    log.info("=================================");

    MemberReadDTO readDTO = memberMapper.selectOne(username);

    log.info(readDTO);

    log.info("----------------------------");

    MemberDTO memberDTO = new MemberDTO(
      username,
      readDTO.getMpw(),
      readDTO.getMname(),
      readDTO.getRolenames()
    );



    return memberDTO;
  }
  
}
