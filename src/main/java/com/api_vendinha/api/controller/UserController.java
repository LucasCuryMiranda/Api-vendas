package com.api_vendinha.api.controller;

import com.api_vendinha.api.domain.dtos.request.UserRequestDto;
import com.api_vendinha.api.domain.dtos.response.UserResponseDto;
import com.api_vendinha.api.domain.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para gerenciar operações relacionadas aos usuários.
 */
@RestController
@RequestMapping("/api/users") // Define o caminho base para as requisições deste controlador.
@CrossOrigin(origins="*")
public class UserController {


    private final UserServiceInterface userService;


    @Autowired
    public UserController(UserServiceInterface userService) {
        this.userService = userService;
    }


    @PostMapping
    public UserResponseDto salvar(@RequestBody UserRequestDto userRequestDto) {
        // Chama o serviço para salvar o usuário e retorna a resposta.
        return userService.save(userRequestDto);
    }

    @PutMapping("/{id}")

    public UserResponseDto update(
            @PathVariable Long id, @RequestBody UserRequestDto userRequestDto) {
        return userService.update(id, userRequestDto);

    }

    @GetMapping("/{id}")
    public UserResponseDto findUser(@PathVariable Long id) {
        return userService.findUser(id);

    }
}
