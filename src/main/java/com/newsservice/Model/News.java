package com.newsservice.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name="News")
public class News
{

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;

    private String title;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(value=TemporalType.DATE)
    private Date newsDate;

}
