package com.gusuran.authentication.rest.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MandatoryParameterRequest {

    private String channelId;
    private String clientId;
    private String username;
    private String requestId;
}
