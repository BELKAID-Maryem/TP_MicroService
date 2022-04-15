package ma.miaad.compteservice.dtos;

import lombok.Data;

@Data
public class VirementRequestDTO {
    private Long codeSource;
    private Long codeDistination;
    private double moantant;
}
