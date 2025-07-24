package test.entities;


public class product {
    public String name;
    public double price;
    public int quantity;

    public double total_value_in_stock(){
        return price * quantity;
    }

    public void add_products(int quantity){
        //o this faz acessar exatamente o atributo da classe e nao o parametro
        this.quantity += quantity;
    }

    public void remove_products(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + " , $ " 
                    + String.format("%.2f", price) 
                    + " , " 
                    + quantity + " units, Total: $ " 
                    +String.format("%.3f",total_value_in_stock());
    }
}
