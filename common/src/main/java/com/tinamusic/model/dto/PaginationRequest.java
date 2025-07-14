package com.tinamusic.model.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaginationRequest {
    @Min(0)
    private Integer page = 0;

    @Min(1)
    @Max(500)
    private Integer pageSize = 10;
}
