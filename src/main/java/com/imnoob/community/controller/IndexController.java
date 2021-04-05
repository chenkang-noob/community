package com.imnoob.community.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imnoob.community.dto.QuestionDTO;
import com.imnoob.community.mapper.UserMapper;
import com.imnoob.community.model.User;
import com.imnoob.community.service.QuestionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    QuestionService questionService;

    @GetMapping("/")
    String index(HttpServletRequest request,
                 HttpServletResponse response,
                 Model model,
                 @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                 @RequestParam(value = "size",defaultValue = "8") Integer size){


        PageInfo<QuestionDTO> pageInfo = questionService.findAllQuestions(pageNum, size);
        model.addAttribute("pageInfo", pageInfo);
        return "index";
    }

}