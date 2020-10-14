package com.example.demo.model;



import java.sql.Time;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Boan {
int id;
String ip;
Timestamp createDate;
String attack;
int numbering;
}
