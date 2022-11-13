package cheese22.shelter.controller;

import cheese22.shelter.domain.Member;
import cheese22.shelter.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping(value = "/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setFirst_name(form.getFirst_name());
        member.setLast_name(form.getLast_name());
       member.setEmail(form.getEmail());
//       // member.setPhone(form.getPhone());
// member.setPw(form.getPw());
//        member.setEmail(form.getEmail());
//        member.setLocation(form.getLocation());
        memberService.join(member);
        return "members/qualifier";
    }
}
