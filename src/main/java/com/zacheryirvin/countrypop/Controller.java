package com.zacheryirvin.countrypop;

import java.util.ArrayList;

import java.util.TreeMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  @GetMapping(value="/list", produces={"application/json"})
  public ResponseEntity<?> getSortedListName() {
    ArrayList<Country> temp = CountrypopApplication.list.returnlistalpha();
    return new ResponseEntity(temp, HttpStatus.OK);
    // return new ResponseEntity(CountrypopApplication.list.getlist(), HttpStatus.OK);
  }

  @GetMapping(value="/listbypop", produces={"application/json"})
  public ResponseEntity<?> getSortedListPop() {
    return new ResponseEntity(CountrypopApplication.list.returnlistbypop(), HttpStatus.OK);
  }

  @GetMapping(value="/list/{firstChar}", produces={"application/json"})
  public ResponseEntity<?> getSortedListFirstChar(@PathVariable char firstChar) {
    ArrayList<Country> temp = CountrypopApplication.list.returnlistfirstalpha(c -> ((Character) c.getname().charAt(0) == (Character.toUpperCase(firstChar))));
    temp.sort((c1, c2) -> {
      return c1.getname().compareToIgnoreCase(c2.getname());
    });
    return new ResponseEntity(temp, HttpStatus.OK);
  }

  @GetMapping(value="/maxpop", produces={"application/json"})
  public ResponseEntity<?> getMaxPop() {
    return new ResponseEntity(CountrypopApplication.list.returnMaxPop(), HttpStatus.OK);
  }
}
