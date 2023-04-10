package com.talataa.apirestfull.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiResponse {

    private String status_code;
    private String description;
    private List<Object> content;

}
