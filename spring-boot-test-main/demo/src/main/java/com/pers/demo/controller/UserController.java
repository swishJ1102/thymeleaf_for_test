package com.pers.demo.controller;

import com.pers.demo.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private List<User> users; // 假设这是您的用户数据

    @GetMapping("/users")
    public String getUsers(Model model, @RequestParam(defaultValue = "0") int page) {
        addUsers(users);
        users.remove(0);
        int pageSize = 10; // 每页显示10条数据
        int totalPages = (int) Math.ceil((double) users.size() / pageSize);
        List<User> paginatedUsers = users.stream()
                .skip(page * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());

        model.addAttribute("users", paginatedUsers);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        return "user-list";
    }

    private void addUsers(List<User> users) {
        for(int i=1;i<=20;i++){
            User user = new User();
            user.setUserName("テスト"+i);
            user.setId(i);
            user.setEMail("メール"+i);
            users.add(user);
        }
    }
}
