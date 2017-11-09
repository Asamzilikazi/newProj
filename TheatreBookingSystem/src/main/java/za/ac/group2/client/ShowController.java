package za.ac.group2.client;

import TheatreTicketBookingSystem.domain.Show;
import TheatreTicketBookingSystem.services.Impl.ShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Tristan on 2017/11/05.
 */
@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/show")
public class ShowController {

    @Autowired
    private ShowServiceImpl showService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Show> getAllAction()
    {
        return showService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addShow(@RequestBody Show show){
        showService.create(show);
    }

    @RequestMapping(value="/find{showID}")
    public @ResponseBody Show findShow(@PathVariable Long showID){
        return showService.readById(showID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateShow(@RequestBody Show show){
        showService.update(show);
    }

    @RequestMapping(value="/delete/{showID}",  method = RequestMethod.DELETE)
    public void deleteShow(@PathVariable Show show){

        showService.delete(show);
    }



}