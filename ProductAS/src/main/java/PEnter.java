import asg.cliche.Command;

import java.math.BigDecimal;
    // includes methods to enter product information in the system
    public class PEnter<getEventStatusByValue> { // PEnter - product enter
        private static Long count = 0L;
        private String name;
        private Long id;
        private BigDecimal price;
        private BigDecimal discount;
        private String description;
        private int value;
        private String CAT;
        public enum category {
            FRUIT,
            VEGETABLE,
            DRINK,
            BREAD,
            MILK,
            CHEMICALS,
            CAR,
        }
        private void category (int value)
        {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
        @Command
        public String getEventStatusByValue (int value)
        {

            switch (value) {
                case 1:
                    CAT = String.valueOf(category.BREAD);
                case 2:
                    CAT = String.valueOf(category.DRINK);
                case 3:
                    CAT = String.valueOf(category.FRUIT);
                case 4:
                    CAT = String.valueOf(category.VEGETABLE);
                case 5:
                    CAT = String.valueOf(category.CAR);
                case 6:
                    CAT = String.valueOf(category.MILK);
                case 7:
                    CAT = String.valueOf(category.CHEMICALS);
                default:
                    break;

            }
                return CAT;
        }

        public PEnter() { //счетчик идентификаторов начиная с 0
            id = count;
            count++;
            //System.out.println(id);
        }
        @Command
        public Long getId() {
            return id;
        }
        //Getter, Setter #name
        @Command
        public String getName() {
            return name;
        }

        @Command
        public void setName(String name) {
            this.name = name;
        }
        //Getter, Setter #price
        public BigDecimal getPrice() {
            return price;
        }
        @Command
        public void setPrice(BigDecimal price) {
            this.price = price;
        }
        //Getter, Setter #Discount
        @Command
        public BigDecimal getDiscount() {
            return discount;
        }
        @Command
        public void setDiscount(BigDecimal discount) {
            this.discount = discount;
        }
        //Getter, Setter #Discription
        @Command
        public String getDescription() {
            return description;
        }
        @Command
        public void setDescription(String description) {
            this.description = description;
        }



    }


