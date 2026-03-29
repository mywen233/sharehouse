package com.sharehouse.controller;

import com.sharehouse.model.User;
import com.sharehouse.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> credentials, HttpSession session) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        Map<String, Object> response = new HashMap<>();
        Optional<User> userOpt = userRepository.findByEmail(email);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            if ("1".equals(user.getFreeze())) {
                response.put("flag", "0");
                response.put("message", "您的账号已被查封");
            } else if (password.equals(user.getPassword())) { 
                session.setAttribute("userid", user.getId());
                response.put("flag", "1");
                response.put("userid", user.getId());
            } else {
                response.put("flag", "0");
                response.put("message", "密码不匹配");
            }
        } else {
            response.put("flag", "0");
            response.put("message", "用户不存在");
        }
        return response;
    }

    @PostMapping("/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @GetMapping("/me")
    public User getMe(HttpSession session) {
        Long userId = (Long) session.getAttribute("userid");
        if (userId == null) return null;
        return userRepository.findById(userId).orElse(null);
    }
}
