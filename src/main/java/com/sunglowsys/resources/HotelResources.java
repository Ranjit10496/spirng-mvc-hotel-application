package com.sunglowsys.resources;


import com.sunglowsys.domain.Hotel;
import com.sunglowsys.service.HotelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HotelResources {
    private final HotelService hotelService;

    public HotelResources(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    @PostMapping("/hotels")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel result = hotelService.save(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/hotels")
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel){
        Hotel result = hotelService.update(hotel);
        return  ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

   @GetMapping("/hotels")
    public ResponseEntity<Page<Hotel>> findAll(Pageable pageable) {
       Page<Hotel>  result = hotelService.finalAll(pageable);
       return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/hotels/{id}")
    public ResponseEntity<Optional<Hotel>> findOne(@PathVariable Long id){
        Optional<Hotel> result = hotelService.findOne(id);
        return  ResponseEntity.status(HttpStatus.OK).build();
    }

    public ResponseEntity<Void> deleteHotel(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
