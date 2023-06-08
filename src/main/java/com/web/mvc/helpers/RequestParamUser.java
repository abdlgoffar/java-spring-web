package com.web.mvc.helpers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RequestParamUser {
    private String firstName;
    private String middleName;
    private String lastName;
    private RequestParamAddress address;
}
