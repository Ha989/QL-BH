package QuanLyBanHang;

import java.util.Date;

public class Customer extends CommonOb{
    private String phoneNumber;


    public Customer() {
    }

    public Customer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer(Long id, String name, Date printDate, String phoneNumber) {
        super(id, name, printDate);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void Infor() {
        System.out.println("Customer Information ");
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getPhoneNumber());
        System.out.println(this.getPrintDate());
    }

    @Override
    public int deleteInfor() {
        return 0;
    }

    @Override
    public void money(int quantity, float productPrice) {
        System.out.println("Total bill " + (quantity*productPrice));

    }
}
