package com.legacy.gamesvc.user.controller;

import com.legacy.gamesvc.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : com.legacy.gamesvc.user.controller
 * fileName       : UserController
 * author         : jbkim
 * date           : 2023-04-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-15        jbkim       최초 생성
 */
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("/{userId}")
    public String user(@PathVariable String userId){
        return userId + "님이 입장하셨습니다.";
    }
}
