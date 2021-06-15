package pe.edu.upc.wheelmanagerserversite.resource;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveCorporationServiceResource {
    @Column(unique = true)
    private int rating;

    @NotNull
    @Size(max = 50)
    @Column(unique = true)
    private String name;

    @NotNull
    @Lob
    private String description;


    @NotNull
    private  Double price;

    @NotNull
    @Lob
    private String picture;
}
