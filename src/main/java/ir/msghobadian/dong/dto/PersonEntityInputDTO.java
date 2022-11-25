package ir.msghobadian.dong.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PersonEntityInputDTO {
    private final Long studentId;
    private final String firstName;
    private final String lastName;
}
