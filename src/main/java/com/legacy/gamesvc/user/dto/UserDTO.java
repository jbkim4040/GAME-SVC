package com.legacy.gamesvc.user.dto;

import lombok.Getter;

/**
 * packageName    : com.legacy.gamesvc.user.dto
 * fileName       : UserDTO
 * author         : jbkim
 * date           : 2023-04-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-16        jbkim       최초 생성
 */

@Getter
public class UserDTO {

    private String userId;
    private String userName;
    private String userEmail;

    private String userPassword;
}