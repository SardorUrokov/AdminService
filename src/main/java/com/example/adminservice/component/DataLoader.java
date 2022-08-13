package com.example.adminservice.component;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * project: AdminService
 * author: Sardor Urokov
 * created at 1:14 AM on 13/Aug/2022
 **/

@Component
@RequiredArgsConstructor
public class DataLoader {

    @Value("${spring.sql.init.mode}") // spring.sql.init.mode= ( always or never )
    private String mode;

}
