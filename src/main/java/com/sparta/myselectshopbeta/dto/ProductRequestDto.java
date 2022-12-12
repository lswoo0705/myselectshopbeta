package com.sparta.myselectshopbeta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// product entity에 있는 값을 그대로 반환하는게 아닌 dto에 감싸서 보내는 것이 좋다
// 만약 entity에 있는 column값 뿐만 아니라 그 외의 값들도 보내줘야 한다면 dto를 통해 보내줘야 하는 경우가 있다.

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    // 관심상품명
    private String title;
    // 관심상품 썸네일 image URL
    private String image;
    // 관심상품 구매링크 URL
    private String link;
    // 관심상품의 최저가
    private int lprice;
}