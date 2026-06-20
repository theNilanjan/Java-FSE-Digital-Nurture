class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Headphones", "Electronics")
        };

        int searchId = 104;

        System.out.println("----- Linear Search -----");
        Product linearResult = linearSearch(products, searchId);

        if (linearResult != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + linearResult.productId);
            System.out.println("Name: " + linearResult.productName);
            System.out.println("Category: " + linearResult.category);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println();

        System.out.println("----- Binary Search -----");
        Product binaryResult = binarySearch(products, searchId);

        if (binaryResult != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + binaryResult.productId);
            System.out.println("Name: " + binaryResult.productName);
            System.out.println("Category: " + binaryResult.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
}