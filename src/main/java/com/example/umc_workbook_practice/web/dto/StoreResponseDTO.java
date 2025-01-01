package com.example.umc_workbook_practice.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

public class StoreResponseDTO {


       /*
    자잘한 DTO를 모두 하나의 클래스로 만들면,
		1. 특정 DTO를 찾기가 힘들고
		2. 전체 프로젝트 구조를 알아보기가 힘들어진다
    따라서 큰 단위의 DTO를 하나의 클래스로 두고 하위 DTO들은 static class로 두는 것이 좋다
    */



    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReviewDetailDTO {
        String ownerNickname;
        /*
        여기서 사용할 사용자 정보가 닉네임 하나가 아니라 여러 개라면
        (ex. 사용자 평균 별점, 해당 가게 이용 횟수 등)
        그 자체로 DTO를 새로이 만드는 것이 더 좋음
         */
        Float score;
        String body;
        LocalDate createdAt;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReviewPreviewListDTO {
        List<StoreResponseDTO.ReviewDetailDTO> reviewList;
        Integer listSize;
        Integer totalPage;
        Long totalElements;
        Boolean isFirst;
        Boolean isLast;
    }

}
