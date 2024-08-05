package QWE_D;

public class InvoiceItem {
    String id;
    String desc;
    int qte;
    double unitPrice;
    public InvoiceItem(String id, String desc, int qte, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qte = qte;
        this.unitPrice = unitPrice;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getQte() {
        return qte;
    }
    public void setQte(int qte) {
        this.qte = qte;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double  getTotal(){
        return qte*unitPrice;
    }
    public String toString(){
        return "id = "+id + "\n" + "Desc = " + desc + "\n" + "Qte = " +qte + "\n" + "Unit Price = " + unitPrice;
    }

    public static void main(String[] args) {

        InvoiceItem it = new InvoiceItem("12", "Desk" , 3,55);

        System.out.println(it.toString());
        System.out.println("Total Price = " + it.getTotal());

    }
}


