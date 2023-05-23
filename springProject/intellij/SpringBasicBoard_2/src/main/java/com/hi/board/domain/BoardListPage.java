package com.hi.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardListPage {

    // 페이지 당 출력할 게시물의 개수
    private int countPerPage;
    // 현재 페이지 번호
    private int pageNum;
    // 게시물의 리스트 List<BoardDTO> :
    private List<BoardDTO> list;
    // 전체 게시물의 개수
    private int totalCount;
    // -=====  받아오는 변수 받는용  -- 아래는 여기서 수식 계산용
    // 페이징 시작 번호
    private int startNum;
    // 페이징 끝 번호
    private int endNum;
    // 이전 버튼 출력 유무
    private boolean prev;
    // 다음 버튼 출력 유무
    private boolean next;

    public BoardListPage(
            int countPerPage,
            int pageNum,
            List<BoardDTO> list,
            int totalCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;
        calPageInfo();
    }

    //-----------------------------
    // countPerPage, 한페이지에 몇개야
    // requestPageNum, 몇번째 페이지야?
    // list, 검색한 리스트 뽑아
    // totalCount 총 로우가 몇줄이야

    private void calPageInfo(){

        // 끝 번호
        // Math.ceil : 소수점 이하의 값을 무조건 올림
        this.endNum = (int)( Math.ceil(this.pageNum*1.0/10) )*10;
        // 10 20 30 40같이 행의 마지막 을 보여준다. // 각각의 마지막 끝수

        // 시작 번호
        this.startNum = this.endNum - 9; // 1 11 21 31 식으로 첫자리가 나올꺼다ㅣ.

        // 실제 끝 번호 : 전체 페이지의 끝번호
        int realEndNum =  (int)(Math.ceil( this.totalCount * 1.0 /  countPerPage )) ;
        // count로 토탈 로우 수 를 한페이지 보여줄수(5) 로 나눠주고 올림
        //만약 71개 라면 14.2페이지로 15페이지의 탭을 만들어준다. 그중 마지막 탭이 15인걸 확인한다.

        // endNum
        this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;
        // realEndNum가 15인데  this.endNum는 20일 수있잖아? 그럴떄
        // realEndNum가 작으면 엔드넘은 realEndNum가 되는거야 사실상 거의 realEndNum 진짜 끝번호인거지

        // 이전 유무
        this.prev = this.startNum > 1;
        //1이 아니면 이게 false가 담겨서 버튼이 나오도록 만들꺼다.

        // 다음 유무 : 현재 구간의 마지막 번호  < realEndNum
        this.next = this.endNum < realEndNum;
        // 이건 뭐 거의 펄스겠지
    }


}
