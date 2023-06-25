package org.example.assembler;

import org.example.dao.MemberDao;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;

public class Assembler {

    // 객체를 저장하고 있고,
    // 저장된 객체를 제공 기능
    // 제공하는 객체는 이미 만들어 놓은 객체를 제공 : singleton 효과
    // 컨테이너 : 객체를 생성, 제공, 소멸

    // MemberDao, MemberRegisterService, ChangePasswordService
    private MemberDao memberDao;
    private MemberRegisterService registerService;
    private ChangePasswordService passwordService;

    public Assembler(){
        // 객체 생성, 의존 주입
        memberDao = new MemberDao();
        registerService = new MemberRegisterService();
        passwordService = new ChangePasswordService();
    }

    // 객체를 제공해주는 메소드
    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getRegisterService() {
        return registerService;
    }

    public ChangePasswordService getPasswordService() {
        return passwordService;
    }
}