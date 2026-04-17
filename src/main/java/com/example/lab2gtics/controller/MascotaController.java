package com.example.lab2gtics.controller;

import com.example.lab2gtics.entity.Mascota;
import com.example.lab2gtics.repository.MascotaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/mascota")
public class MascotaController {
    final MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping(value = {"/list", ""})
    public String listarMascotas(Model model) {
        List<Mascota> lista = mascotaRepository.findAll();
        model.addAttribute("mascotaList", lista);
        return "mascota/list";
    }

}
