package patterns;

public class Pizza {
    private final int dough;
    private final String cheeze;
    private final String meat;
    private final String onion;

    public static class Builder {
        private final int dough;
        private String cheeze = "";
        private String meat = "";
        private String onion = "";

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
