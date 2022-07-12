package com.meli.obterdiploma.model;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    @NotBlank (message = "O nome do aluno não pode ficar vazio.")
    String studentName;

    String message;
    Double averageScore;

    @NotBlank (message = "A lista de disciplinas não pode ficar vazia.")
    List<@Valid SubjectDTO> subjects;
}
