package kr.ac.kumoh.s20240042.w25_w07_controller.controller

import kr.ac.kumoh.s20240042.w25_w07_controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(
    private val service: SongService
) {
    //val title = listOf("Golder", "Blue Valentine", "타임캡슐")

    @GetMapping("/songs")
    fun getSongList() = service.getAllSongs()
}