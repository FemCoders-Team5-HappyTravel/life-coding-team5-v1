package com.example.livecoding.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "courses")
@Data
public class Course {

   private Long id;
   private String name;
   private String category;
   private String description;





}
