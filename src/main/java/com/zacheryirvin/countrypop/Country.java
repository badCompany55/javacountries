package com.zacheryirvin.countrypop;

import java.util.concurrent.atomic.AtomicLong;

public class Country {
  private static final AtomicLong counter = new AtomicLong();
  private long id;
  private String name;
  private int population;
  private int landmass;
  private int medianage;

  public Country(String name, int population, int landmass, int medianage) {
    this.id = counter.incrementAndGet();
    this.name = name;
    this.population = population;
    this.landmass = landmass;
    this.medianage = medianage;
  }

  public String getname() {
    return this.name;
  }

  public int getpopulation() {
    return this.population;
  }

  public int getlandmass() {
    return this.landmass;
  }

  public int getmedianage() {
    return this.medianage;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }

    if((obj == null) || (this.getClass() != obj.getClass())) {
      return false;
    }

    String objname = ((Country) obj).getname();
    return this.name.equals(objname);

  }

  @Override
  public int hashCode() {
    return this.name.hashCode() + 57;
  }

  // @Override
  // public int compareTo(Country c) {
    // if(this == c) {
      // return 0;
    // }
//
    // if(c != null) {
      // if(this.population > c.getpopulation()) {
        // return 1;
      // } else if(this.population < c.getpopulation()) {
        // return -1;
      // } else {
        // return 0;
      // }
    // }
//
    // throw new NullPointerException();
  // }
}
