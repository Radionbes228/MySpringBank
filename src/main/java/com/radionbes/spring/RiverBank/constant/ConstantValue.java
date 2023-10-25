package com.radionbes.spring.RiverBank.constant;


import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Data
public class ConstantValue {
    private String CREDIT_HOME = "creditS/credit";
    private String CREDIT_INFO = "creditS/info-credit";
    private String CONTRIBUTION_HOME = "contributionS/contribution";
    private String CONTRIBUTION_INFO = "contributionS/contribution-info";
}
