package patterns;
import java.lang.annotation.*;


public class Pizza {
    private final int dough;
    private final String cheeze;
    private final String meat;
    @Exclude
    private final String onion;

    @Target({ElementType.FIELD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Exclude {
    }

    public static class Builder {
        private final int dough;
        private String cheeze = "mozzarella";
        private String meat = "";
        public String onion = "red";

        public Builder(int dough) {
            this.dough = dough;
        }

        public Builder cheeze(String cheeze) {
            this.cheeze = cheeze;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder onion(String onion) {
            this.onion = onion;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        dough = builder.dough;
        cheeze = builder.cheeze;
        meat = builder.meat;
        onion = builder.onion;
    }
}
