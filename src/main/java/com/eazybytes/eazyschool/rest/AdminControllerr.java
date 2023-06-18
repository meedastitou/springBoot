package com.eazybytes.eazyschool.rest;

import com.eazybytes.eazyschool.ColorLogger.ColorLogger;
import com.eazybytes.eazyschool.model.*;
import com.eazybytes.eazyschool.repository.CoursesRepository;
import com.eazybytes.eazyschool.repository.EazyClassRepository;
import com.eazybytes.eazyschool.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.faces.bean.RequestScoped;

@Slf4j
@Controller
@RequestScoped
public class AdminControllerr {
	
	@Autowired
	public AdminControllerr(ColorLogger colorLogger) {
		colorLogger.logError("test");
	}
	
    @Autowired
    EazyClassRepository eazyClassRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    CoursesRepository coursesRepository;

    
   @GetMapping("/public/s")
   @ResponseBody()
   public Person getp() {
	   
	   return new Person();
   }
}
