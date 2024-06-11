package com.fisa.lep.area.dto.request;

import com.fisa.lep.area.entity.Depth;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class RequestAreaInfoDTO {
    // address_name
    private String fullAddr; // 서울 중구 수표동 99

    private Depth depth; // REGION1, REGION2, REGION3

    private String productName;
}
