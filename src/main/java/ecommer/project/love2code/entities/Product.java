package ecommer.project.love2code.entities;
                                                                                                                                                                                                                                                                                                                                         import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="product")
public class Product {

    public Product() {
		super();
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable= true, name = "sku")
    private String sku;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "unit_price", nullable = true)
    private double unitPrice;

    @Column(name = "image_url", nullable = true)
    private String imageUrl;

    @Column(name = "active", nullable = true)
    private boolean active;

    @Column(name = "units_in_stock", nullable = true)
    private int unitsInStock;

    @Column(name = "date_created", nullable = true)
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated", nullable = true)
    @UpdateTimestamp
    private Date lastUpdated;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable=true)
    private ProductCategory category;

	public Product(String sku, String name, String description, double unitPrice, String imageUrl) {
		super();
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		
	}
}

