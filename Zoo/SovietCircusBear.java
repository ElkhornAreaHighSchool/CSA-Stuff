    
    public class SovietCircusBear extends Bear
    {
        private String toy;
    
        /**
         * Constructor for objects of class SovietCircusBear
         */
        public SovietCircusBear()
        {
            super(" soviet circus bear that has lived for a while",
                  "it rides around on its tricycle");
            this.toy = "tricycle";
        }
       
        @Override
        public String makeNoise()
        {
            return "the tricycle squeaks as the bear rides it.";
        }
    
    }
