package ru.panic.template.controller;

import org.springframework.web.bind.annotation.*;
import ru.panic.template.dto.ChangeDataRequestDto;
import ru.panic.template.dto.ChangeUserDataRequestDto;
import ru.panic.template.dto.SignInRequestDto;
import ru.panic.template.dto.SignInResponseDto;
import ru.panic.template.entity.User;
import ru.panic.template.service.impl.AuthorizeServiceImpl;

@RestController
@RequestMapping("/api/")
public class AuthController {
    public AuthController(AuthorizeServiceImpl authorizeService) {
        this.authorizeService = authorizeService;
    }
    private final AuthorizeServiceImpl authorizeService;
    @PostMapping("/auth/signIn")
    private SignInResponseDto signIn(@RequestBody SignInRequestDto signInRequest){
        return authorizeService.signIn(signInRequest);
    }
    @PostMapping("/auth/signUp")
    private SignInResponseDto signUp(@RequestBody SignInRequestDto signInRequest){
        return authorizeService.signUp(signInRequest);
    }
    @PostMapping("/v1/getInfoByJwt")
    private User getInfoByJwt(@RequestParam(name = "jwtToken") String jwtToken) {
        return authorizeService.getInfoByJwt(jwtToken);
    }
    @PutMapping("/auth/changeUserData")
    private User changeUserData(
            @RequestHeader(name = "jwtToken") String jwtToken,
            @RequestBody ChangeUserDataRequestDto request
    ){
        return authorizeService.changeUserData(jwtToken, request);
    }
    @PutMapping("/auth/changeData")
    private User changeData(
            @RequestHeader(name = "jwtToken") String jwtToken,
            @RequestBody ChangeDataRequestDto request
    ){
        return authorizeService.changeData(jwtToken, request);
    }
}
