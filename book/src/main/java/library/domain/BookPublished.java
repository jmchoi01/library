package library.domain;

import java.time.LocalDate;
import java.util.*;
import library.domain.*;
import library.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BookPublished extends AbstractEvent {

    private Long id;
    private String title;
    private String content;
    private Long viewCount;
    private Date createdAt;
    private Date updatedAt;
    private Integer price;
    private File bookCover;
    private String summary;
    private Long authorId;
    private Boolean isBestseller;

    public BookPublished(Book aggregate) {
        super(aggregate);
    }

    public BookPublished() {
        super();
    }
}
//>>> DDD / Domain Event
