package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Entity.Nhanvien;
import Service.loginService;

@Controller
public class LoginController {
	@Autowired
	loginService ls;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(ModelMap mm) {
		return "/login";
	}

	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response, ModelMap m, HttpSession session,
			@ModelAttribute("userForm") Nhanvien nv) {
		Nhanvien nvAD = ls.loginNV(nv.getEmail(), nv.getPassword());
		if (nvAD != null) {
			session.setAttribute("tentaikhoan", nvAD);
			return "redirect:/em";
		} else {
			m.put("msg", "Incorrect email or password!");
			return "/login";
		}

	}

	@RequestMapping("/em")
	public String employed() {
		return "/employed";
	}
}
