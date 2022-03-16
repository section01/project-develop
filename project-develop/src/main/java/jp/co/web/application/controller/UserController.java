package jp.co.web.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.web.application.resource.UserForm;
import jp.co.web.domain.service.UserService;

/**
 *
 * ユーザ管理コントローラー
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	/**
	 * ユーザ管理画面サービス
	 */
    @Autowired
    private UserService userService;

    /**
     * 初期化バインダ
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    /**
     * 初期化
     */
    @RequestMapping
    public String init(Model model, @ModelAttribute UserForm userForm) {
        return "user";
    }

    /**
     * 登録
     */
    @PostMapping(value="event", params="regist")
    public String insert(Model model, @ModelAttribute UserForm userForm) {

        userService.insertUser(userForm);

        return "forward:/user";
    }

    /**
     * 登録
     */
    @PostMapping(value="event", params="delete")
    public String delete(Model model, @ModelAttribute UserForm userForm) {

        userService.deleteUser(userForm);

        return "forward:/user";
    }

    /**
     * 戻る
     */
    @PostMapping(value="event", params="back")
    public String back(Model model) {
        return "forward:/list";
    }

}
