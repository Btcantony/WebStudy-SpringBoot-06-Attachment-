package org.zerock.b01.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long bno;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String title;

    @NotEmpty
    private String content;

    @NotEmpty
    private String writer;

    private LocalDateTime regDate;

    private LocalDateTime modDate;

    //첨부파일의 이름들
    private List<String> fileNames;
}