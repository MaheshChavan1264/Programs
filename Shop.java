import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    private String shopName;
    private String shopAddress;
    private String[] products;
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getShopAddress() {
        return shopAddress;
    }
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
    public String[] getProducts() {
        return products;
    }
    public void setProducts(String[] products) {
        this.products = products;
    }
    public Shop(String shopName, String shopAddress, String[] products) {
        setShopName(shopName);
        setShopAddress(shopAddress);
        setProducts(products);
    }
    public boolean checkProductAvailability(String productname) {
        String[] pro = getProducts();
        for (String s : pro) {
            if (productname.equals(s)) {
                continue;
            }
            return true;
        }
            return false;
    }
    public static void main(String[] a){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the shopname:");
        String shopName = scanner.next();
        System.out.println("Enter the address:");
        String shopAddress = scanner.next();
        System.out.println("Enter the number of products:");
        int num = scanner.nextInt();
        String[] products=new String[num];
        for (int i = 0; i <num ; i++) {
            String input = scanner.next();
            products[i]=input;
        }
        System.out.println("Enter the product to be searched:");
        String product=scanner.next();
        Shop shop=new Shop(shopName,shopAddress,products);
        if(shop.checkProductAvailability(product)){
            System.out.println("Product is available at "+shopName+", "+shopAddress);
        }else{
            System.out.println("Product is not available at "+shopName+", "+shopAddress);
        }
    }
}