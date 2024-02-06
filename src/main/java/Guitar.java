public class Guitar {
    public static String serialNumber;
    public static double price;
    public static Builder builder;
    public static enum Builder{
        FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
        public String toString(){
            switch(this){
                case FENDER: return "Fender";
                case MARTIN: return "Martin";
                case GIBSON: return "Gibson";
                case COLLINGS: return "Collings";
                case OLSON: return "Olson";
                case RYAN: return "Ryan";
                case PRS: return "PRS";
                default: return "unspecified";
            }
        }
    }
    public static String model;
    public static Type type;
    public static enum Type{
        ACOUSTIC, ELECTRIC;
        public String toString(){
            switch(this){
                case ACOUSTIC: return "acoustic";
                case ELECTRIC: return "electric";
                default: return "unspecified";
            }
        }
    }
    public static Wood backWood;
    public static enum Wood{
        INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
        public String toString(){
            switch(this){
                case INDIAN_ROSEWOOD: return "Indian Rosewood";
                case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
                case MAHOGANY: return "Mahogany";
                case MAPLE: return "Maple";
                case COCOBOLO: return "Cocobolo";
                case CEDAR: return "Cedar";
                case ADIRONDACK: return "Adirondack";
                case ALDER: return "Alder";
                case SITKA: return "Sitka";
                default: return "unspecified";
            }
        }
    }
    public static Wood topWood;

    public static String getSerialNumber(){
        return serialNumber;
    }
    public static double getPrice(){
        return price;
    }
    public static void setPrice(double p){
        price = p;
    }
    public static Builder getBuilder(){
        return builder;
    }
    public static String getModel(){
        return model;
    }
    public static Type getType(){
        return type;
    }
    public static Wood getBackWood(){
        return backWood;
    }
    public static Wood getTopWood(){
        return topWood;
    }
}
