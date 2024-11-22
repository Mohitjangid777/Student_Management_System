package com.Spring.smsf.Controller;

import com.Spring.smsf.Entity.Student;
import com.Spring.smsf.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public String getAllStudent(Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    @GetMapping("/new")
    public String createStudentForm(Model model){
        //create student object to hold student form data
        Student student=new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping()
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.addStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/edit/{id}")
    public String UpdateStudentForm(@PathVariable Long id,Model model){
         model.addAttribute("student",studentService.getStudentById(id));
         return "edit_student";
    }
    @PostMapping("/{id}")
    public String updateStudent(@PathVariable Long id
            ,@ModelAttribute("student")Student student,
                Model model){

        //get students from DB by id
        Student existingStudent= studentService.getStudentById(id);
        existingStudent.setId(student.getId());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setStandard(student.getStandard());
        existingStudent.setRollNo(student.getRollNo());

        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }
}
