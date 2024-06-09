package com.fisa.lep.area.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class RequestAreaDTO {
    // address_name
    private String fullAddr; // 서울 중구 수표동 99

    // 지역 1 Depth, 시도 단위
    private String region1depthName; //  서울

    // 지역 2 Depth, 구 단위
    private String region2depthName; // 중구

    // 지역 3 Depth, 동 단위
    private String region3depthName; // 수표동

    // 지역 3 Depth, 행정동 명칭
    private String region3depthHName; // 명동

    // 우편번호
    private String zoneNo; // 04542
}
