package com.collectiveDunes.pageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollectiveDunesPageController {

  @RequestMapping("/")
  public String showPage() {
    return "index";
  }
}
