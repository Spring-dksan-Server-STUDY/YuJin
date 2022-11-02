package com.dksaServer.yujindonut.Week3.controller;

import com.dksaServer.yujindonut.Week3.Model.Member;
import com.dksaServer.yujindonut.Week3.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    @ResponseBody
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}