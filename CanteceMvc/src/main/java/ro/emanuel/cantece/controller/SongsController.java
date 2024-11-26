package ro.emanuel.cantece.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.cantece.dao.SongDAO;
import ro.emanuel.cantece.pojo.Song;

@Controller
public class SongsController {

	@GetMapping("/song")
	public String singleSong(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {
		Song song = SongDAO.getById(id);
		
		model.addAttribute("s", song);
		
		return "song.jsp";
	}
	
	@GetMapping("/songs")
	public String allSongs(Model model) throws SQLException, ClassNotFoundException {
		ArrayList<Song> allSongs = SongDAO.getAll();
		
		model.addAttribute("all", allSongs);
		
		return "songs.jsp";
	}
	
	@GetMapping("/song/edit/{id}")
	public String editSong(Model model, @PathVariable int id) throws ClassNotFoundException, SQLException {
		Song s = SongDAO.getById(id);
		
		model.addAttribute("song", s);
		
		return "/songEdit.jsp";
		
	}
	@PostMapping("/song/edit")
	public String saveEditSong(@ModelAttribute("song") Song s, ModelMap model, BindingResult result) throws ClassNotFoundException, SQLException {
		SongDAO.update(s);
		return "redirect:/songs";
	}
	
	@GetMapping("/song/createSong")
	public String createSong(Model model) {
		Song s = new Song();
		model.addAttribute("newSong",s);
		return "/createSong.jsp";
	}
	@PostMapping("/song/saveNewSong")
	public String saveNewSong(@ModelAttribute("newSong") Song song) throws ClassNotFoundException, SQLException {
		SongDAO.create(song);
		return "redirect:/songs";
		
	}
	@GetMapping("/song/delete/{id}")
	public String deleteSong(@PathVariable int id ) throws ClassNotFoundException, SQLException {
		SongDAO.delete(id);
		return "redirect:/songs";
		
	}
	
}