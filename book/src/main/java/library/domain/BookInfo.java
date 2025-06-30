package library.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "BookInfo_table")
@Data
public class BookInfo {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;
    private Long viewCount;
    private Date createdAt;
    private Date updatedAt;
    private Integer price;
    private String bookCoverUrl;
    private String summary;
    private Long authorId;
    private Boolean isBestSeller;
}
