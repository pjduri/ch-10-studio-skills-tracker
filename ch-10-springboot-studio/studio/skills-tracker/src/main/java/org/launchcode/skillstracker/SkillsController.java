package org.launchcode.skillstracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String startSkills() {
        String homeHTML = "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn.  Here's the list!</h2>\n" +
                "<ol>\n" +
                "    <li>Java</li>\n" +
                "    <li>JavaScript</li>\n" +
                "    <li>Python</li>\n" +
                "</ol>";
        return homeHTML;
    }

    @GetMapping("form")
    @ResponseBody
    public String displaySkillForm() {
        return "<form method=\"post\">\n" +
                "    <label>Name: </label> <br>\n" +
                "    <input type=\"text\" name=\"name\">\n" +
                "    <br>\n" +
                "    <label>My favorite language: </label>\n" +
                "    <br>\n" +
                "    <select name=\"firstChoice\">\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "    <br>\n" +
                "    <label>My second favorite language: </label>\n" +
                "    <br>\n" +
                "    <select name=\"secondChoice\">\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "    <br>\n" +
                "    <label>My third favorite language: </label>\n" +
                "    <br>\n" +
                "    <select name=\"thirdChoice\">\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select><br>\n" +
                "    <input type=\"submit\" value=\"Submit\">\n" +
                "</form>";
    }

    @PostMapping("form")
    @ResponseBody
    public String displayResults(@RequestParam String name,
                                 @RequestParam String firstChoice,
                                 @RequestParam String secondChoice,
                                 @RequestParam String thirdChoice) {

        return "<h1>" + name + "</h1>\n" +
                "<ol>\n" +
                "    <li>" + firstChoice+ "</li>\n" +
                "    <li>" + secondChoice+ "</li>\n" +
                "    <li>" + thirdChoice+ "</li>\n" +
                "</ol>";
    }


}
