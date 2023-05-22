package com.hi.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PageOption {

    private BoardSearchOption searchOption;
    private int startNum;
    private int count;

}
