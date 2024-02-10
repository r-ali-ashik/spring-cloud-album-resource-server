/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rali.ws.controller;

import com.rali.ws.response.AlbumDto;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/albums")
public class AlbumsController {
    
    @GetMapping
    public List<AlbumDto> getAlbums() {
        
        AlbumDto album1 = new AlbumDto();
        album1.setAlbumId("albumIdHere");
        album1.setUserId("1");
        album1.setAlbumTitle("Album One title");
        album1.setAlbumDescription("Album 1 description");
        album1.setAlbumUrl("Album One URL");
        
        AlbumDto album2 = new AlbumDto();
        album2.setAlbumId("albumIdHere");
        album2.setUserId("2");
        album2.setAlbumTitle("Album Two title");
        album2.setAlbumDescription("Album 2 description");
        album2.setAlbumUrl("Album Two URL");
         
        return Arrays.asList(album1, album2);
    }
 
}
