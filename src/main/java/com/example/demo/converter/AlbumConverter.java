package com.example.demo.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.dto.AlbumDto;
import com.example.demo.models.Album;

@Component
public class AlbumConverter {


	public AlbumDto entityToDto(Album album) {
		
		AlbumDto dto = new AlbumDto();		
		dto.setId(album.getId());		
		dto.setImage(album.getImage());
		dto.setUser(album.getUser());
		return dto;
	}
	
	public List<AlbumDto> entityToDto(List<Album> album){
		
		return album.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Album dtoToEntity(AlbumDto dto) {
		Album album = new Album();
		if(dto.getId()==null) {
			album.setImage(dto.getImage());
			album.setUser(dto.getUser());	
		}else {
			album.setId(dto.getId());			
			album.setImage(dto.getImage());
			album.setUser(dto.getUser());	
		}
		
		return album;
	}
	
	public List<Album> dtoToEntity(List<AlbumDto> dto){
		
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
