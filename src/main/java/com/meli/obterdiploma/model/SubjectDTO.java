package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter @Setter
public class SubjectDTO {
    @NotBlank (message = "O nome da disciplina não pode ficar vazio.")
    String name;

    @NotBlank(message = "A nota não pode ficar vazia.")
    @DecimalMax(value = "10.0", message = "A nota máxima é 10")
    @DecimalMin(value = "0.0", message = "A nota mínima é 0.")
    Double score;
}
