package work.punks.pwproductcommon;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private String internalId;
    private String productName;
    private String productDescription;
    private BigDecimal price;
    private String photoUrl;
}
