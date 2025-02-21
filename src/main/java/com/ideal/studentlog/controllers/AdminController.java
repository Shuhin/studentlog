package com.ideal.studentlog.controllers;

import com.ideal.studentlog.database.models.Admin;
import com.ideal.studentlog.helpers.dtos.AdminDTO;
import com.ideal.studentlog.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admins")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping
    public List<Admin> getAll(){
        return adminService.getAll();
    }

    @GetMapping(path = "/{id}")
    public AdminDTO getById(@PathVariable("id") Integer id){
        return adminService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody AdminDTO dto){
        adminService.create(dto);
    }

    @PatchMapping(path = "/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody AdminDTO dto){
        adminService.update(id, dto);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id){
        adminService.delete(id);
    }
}
