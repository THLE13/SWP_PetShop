package model.dao;

import model.entity.Product;
import model.connection.DBConnection;
import model.utils.PShopQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static model.connection.DBConnection.openConnection;

public class adminProduct {

    private DBConnection db = DBConnection.getInstance();

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String sql = PShopQuery.SELECT_PRODUCT;

        try (Connection con = db.openConnection(); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setImgProduct(rs.getString("img"));
                product.setPriceProduct(rs.getDouble("priceProduct"));
                product.setTypeProductId(rs.getInt("typeProductId"));
                product.setSizeId(rs.getInt("sizeId"));
                product.setTrademarkId(rs.getInt("trademarkId"));
                product.setQuantity(rs.getInt("quantity"));
                product.setDateAdded(rs.getDate("dateAdded"));
                product.setDescribe_product(rs.getString("describe_P"));

                products.add(product);
            }

        } catch (Exception e) {
            System.out.println("Error retrieving products: " + e.getMessage());
        }

        return products;
    }
//add product

    public void addProduct(Product product) {
        String sql = PShopQuery.ADD_PRODUCT;
        try (Connection con = db.openConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, product.getProductName());
            pst.setString(2, product.getImgProduct());
            pst.setDouble(3, product.getPriceProduct());
            pst.setInt(4, product.getTypeProductId());
            pst.setInt(5, product.getSizeId());
            pst.setInt(6, product.getTrademarkId());
            pst.setInt(7, product.getQuantity());
            pst.setDate(8, new java.sql.Date(product.getDateAdded().getTime()));
            pst.setString(9, product.getDescribe_product());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //update product 
    public void updateProduct(Product product) {
        String sql = PShopQuery.UPDATE_PRODUCT;
        try (Connection con = db.openConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, product.getProductName());
            pst.setString(2, product.getImgProduct());
            pst.setDouble(3, product.getPriceProduct());
            pst.setInt(4, product.getTypeProductId());
            pst.setInt(5, product.getSizeId());
            pst.setInt(6, product.getTrademarkId());
            pst.setInt(7, product.getQuantity());
            pst.setDate(8, new java.sql.Date(product.getDateAdded().getTime()));
            pst.setString(9, product.getDescribe_product());
            pst.setInt(10, product.getProductId());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Xóa sản phẩm
    public void deleteProduct(int productId) {
        String sql = PShopQuery.DELETE_PRODUCT;
        try (Connection con = db.openConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, productId);
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //getProductById
    public Product getProductById(int productId) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Product product = null;

    try {
        // Mở kết nối đến cơ sở dữ liệu
        conn = db.openConnection();

        // Chuẩn bị câu lệnh SQL với PreparedStatement
        stmt = conn.prepareStatement(PShopQuery.GET_PRODUCT_BY_ID);
        stmt.setInt(1, productId);  // Thiết lập tham số cho câu lệnh SQL

        // Thực thi truy vấn
        rs = stmt.executeQuery();

        // Xử lý kết quả trả về từ ResultSet
        if (rs.next()) {
            // Đọc dữ liệu từ ResultSet và tạo đối tượng Product tương ứng
            int id = rs.getInt("productId");
            String name = rs.getString("productName");
            String img = rs.getString("img");
            double price = rs.getDouble("priceProduct");
            int typeProductId = rs.getInt("typeProductId");
            int sizeId = rs.getInt("sizeId");
            int trademarkId = rs.getInt("trademarkId");
            int quantity = rs.getInt("quantity");
            Date dateAdded = rs.getDate("dateAdded");
            String describeProduct = rs.getString("describe_P");

            // Tạo đối tượng Product từ các dữ liệu lấy được
            product = new Product(id, name, img, price, typeProductId, sizeId, trademarkId, quantity, dateAdded, describeProduct);
            
//            System.out.println(product);
        }
    } catch (Exception e) {
        e.printStackTrace();  // In thông tin lỗi ra console
    } finally {
        // Đóng ResultSet, PreparedStatement và Connection
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();  // Đóng kết nối đến cơ sở dữ liệu
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//        System.out.println(product);
    return product;  // Trả về đối tượng Product hoặc null nếu không tìm thấy sản phẩm
}


    public static void main(String[] args) {
        adminProduct adProduct = new adminProduct();
//        List<Product> productList = adProduct.getAllProducts();
//        for (Product product : productList) {
//            System.out.println(product); // Print product information for verification
//        }

        Product newProduct = new Product();
//        newProduct.setProductName("New Product1");
//        newProduct.setImgProduct("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhUTExMWFhUXFxgWFRcXFxcVGBgYFRUXFxcYGBcYHSggGBolGxgWITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGhAQGi0lHyUtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIALcBEwMBIgACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAAEAAIDBQYBBwj/xABNEAABAwIDBAYFBwkGBAcBAAABAAIRAyEEEjEFQVFhBhMicYGRBzKhscEUI0JS0eHwFWJyc4KSorLxJDM0U7PSNZO0whZDVGOk0/II/8QAGQEAAwEBAQAAAAAAAAAAAAAAAQIDAAQF/8QAJREAAgICAgEEAwEBAAAAAAAAAAECERIhAzETIkFRYQQjMhRx/9oADAMBAAIRAxEAPwDJMapWtXWNUrWr0TlZxrVIGLrWp4CwDgYU8AroTlrMNkpZyulJYxzrEutSK5AW0a2d6xc6xKyVlg2LOuZl2AuwsAaSmqRJExHCUJ5Cjw8loJ1vvnfb2IXujVoRCaQpYXMqNgIoXIUpC4QsAhIXIUuVchGzUQwuKWFyFrBRGjqDA4QQO/QjkhsqKwdKTwUuV6stwrZMdnthcfs1pHZJVgcKImUNXYRJBMb1yR5JXpnXLjj8FPWwxaVFCNq1QVCQF2Rk62cU4xvRBC5CLpDklXA3BHLdAw1YJCSkyrqYUe1qla1EimN6eMONxU8iuIOGp4apuoKXVlHIFEcJQpMq5lRsBGQuQp+odwN9N10bg9i1Xn1DG/QHwlK5xXbCoNlVC5CttpbGfTNgSDpaT3WVcWHgtGaltGlFrsihdyp8JQmsWhkLuVPhKFrCNypQn5UiELNRG8gAnkosF6g0UW0a4ADS4Autc7hBJ9w/aTcBVbJaHtJmYb3X0Pd5qEuT9iRaMP1tliGA8AmvoEd3ELoC7BViRAWrhapiE0hNYtEJCaQpi1cyo2AhIXIU2Rdp0CdEHJINNg8IjDVIcJRr9lERefCFFUwEaFSfLCSqyq45xd0EPxE9yfSxAI0VVcJwqkaKL4Pgquf5FiyHGYgoaFO8Hem5JXRDSohPbsY1yaQpCxcyphCOElLCSNmLnG0Cx7hBIGh3acVDYqzOOvfQ7lK2lTqA7ivPh+Qvc75/jv2KjIeK4SUScI6YA7uajLDwXUpJnK4tEBRVDCmx7o+KhDVYYKm82G5JyzpaH4opvZdUMBLAXCRM3utBsyg0Cyz1DH2g2hW+x3OebLji9nRJaO7RYM0i33IXFMo1KbmuYAXfTi87iVdYzZ9iZWYxvZlaTcGaCUtFHhej9R4eQR2ZjfMe5B0MC94OVpMW8VdYXaNSnmyxDhBn3jmrzZtVhaHWuP6qsfyWxZ/jqJi62zKjW5i06wRGn2oS4Xp+JoEtza2uOHBZfEbNpve4kRvkW/B+1UXPX9EvFf8AJmsxTHKw2lhsjhAsgHq0Zpq0SlFp0V+0qrAGtcQDJIkTbKRw45fNR7Lq07Ds5ybQ2NGum4EIfE4rM8kZsrbAjKZjXU6E3nhCfRxRa5pJeQCBpT4yT5dlck6zz+zsjeGP0XACdCOpsaWA6yhnshdMOVSOafE4EJamwpwxPp0J3KjkkTUWwUMU4wbuCKZhACrCjey5+Tnrovx8N9lbRwhi4twJRow0fR8kfSpSim4a1lyy5GzpUVEq31JtCBfhHGYieBsr91CLQmvoDVKpuPQzSa2Zd2yampAUZ2c4ahacNO/RPySNyr/qmS/zwKrA4HswQhcfsrLJafBX7DCBx9dJHlllaKS4otUzP06EkTZPbg9b6aKeRMroqCCunyS9jm8cfcrerPBJFFySvnIjhEJcAUylWyldmAhajl48WexJF1TxyOZDoNuayrahVjhcYVS6ExTLXE7OZYt8kRh3tp2IhQYfETF13HuzCD4I55abJ+PHpD34mnM7lbbJ2yxpsPgse4c0dhMI4wQ6349qtikrTI5W6aNnitrBwhZzaFUJlTDuABkkTB+BCixOCdMAyocjky3GooqcXX3JmExzwDHFFV9lumDZdweynNcCHD3+xItFm0y+2ZttzqZabEaTwQNXFm6kdTAMwNNAFWY4xMIuTYigu0OxlYPgGwnVVO1WhjSSRllrZ/ScBcakcQFfdG9mGvTxLiJ6ulLf0pzD2NcPFU+2WNOGeHDXLE98hXjOUUSlxxkzEfJL9ljcscgdKXP9YpKOEAcHPY3IDe40+cH/ANaudnbNZUDnFk5QTABkkA2mL6W+y6ftrZtKm3MwAtcBBEkGYggxYQhUsbBqwjZNUGmGtNmnQ6ibj2GPBHQqno+BlfAjtx/CPuV2AuqD9KOXkXqZym8jRTDEP3/BRABF0ns3+5ab+jRX2dBOtvBS03HgpBWYkagkELnkdEWH4Wyn66ENQPBcxTeBXPdFatj8RiUI7EojZ2BdUo4qp/lsBb3g5nfwtI8VQ0qxKDvsoorot6mJBAUXyiFCcKRedVIyiMtzdANJHH1+CArPJR1GjMCNVpP/AA92JAEqkE+0T5JJaZhXsIUJAV/jKNyMpG6CFB+T7gATPHcumPMkc0uFsqISVrV2W8GwBHFJU8iJ+NlRVqKNtyuvpHiFGZC8uLPVkEw0ojDUhOqrg5SU6sKgpfuo5W2QtaoQo6W0bQVBise2SJ0YXxyFpSoLCdnNFR4bE8e5aynhWNGUW7t6yGBqlrgW6lerbH2ZSqUKb3NOYiT2jx5FX43ejm5lWzL1aMGDpFpQ9kZth7W4h7JPYiBM2IMT5FV1Nhq1AyndzjA+Pglk9girQ171C4kXAW8wHRWi0DrB1jt5JIb4AfFLHdGKRBNIZHcJJaeRnTwR8UjeWKMBVxR3hVOOqk6BG7axIZUNNwykNeSDaMhaDPmu7J2e+tVZSbq43O5oFyT4JYwso54o9L6N7CbhmPaIOctJ8KbWkH9oOP7S869IOwTh6cNBeCxs5QTcPgnyhevrHek3CuOFc9r3NAABLSQRL2wZHO3iuiaVHNCTy/6eKYXG1KTjFN9rTleCLA2Ibbdpqm43F1KmaaT+0TPZfcyQSSRfehKuNxGYgVn8pc7cBz7/AMBeu+j7onh8VgKVauaz6rnVQ5wxFdgOSvUYLNeALNA/qlW1Vjt1swPR6i7I8Fjh29CD9UK6bRd9U+RXp+E6GYWm0tYKtzMmvWeZgDV7jw0Vdtjo46k01KT3uaLuaT2gBqQRr5KuWKItZMwXyd31XeRUrcMfqu9v2LU4fENc2RMd5me9MwOBdVqZA9wmdCTHO50Q8lhUKM4KJ+q72/YndU7gfIr0vA9G6TB2i6o7eXOcB4NBgIXbHRcOaXUHOY4fRzOLXcrmx9iDtoyaTMJSa4cfIoiph3OFp8QVyrnaSC51rG5srHYmGqVarWte6NXGSYA1PuHiueUVZ0qTqzZ7I2MygypTFw9xJ7i0Nj2HzXmvSjZfyWs1jbg02O7zdrj5tJ8V68sN6Q9jve5lZpkZRTI4GXOB9p8uapyx9OifDP17ZixjSRC515ClfsCsBmtBSw2x3H1j4Lm2jruLNBscMcA7eNe8K9q7UIFmg7pmL9yoqdWmwAQQQIJO+Fw45pNjdXjyKKOWXHk7G7SqEyXAAofZ9FzzMWGgM3T69TNqQjdn4ylTFz93ckTTltjtNR0iZ+IAMAHyH2rqCrbZp5j2gkmzXyLg/gzB2U4/SCjOyXcQj2bZououIYcwc24aYgZc3dcOCdTxAdTFRtxBNhrlJFp7lDBo6s0/YqX7MdqCIjS3nP41XBs13EDxRFDHNdTc3K4vHZs0xMBsn39yM2dTFWn1jbjM7+Yx7IWqQbiBt2QYnM3zWP2njf7TWbPZFI0hAtmEEieEh11usRSLQTGgJ8gvNquapXrGCG5qhBiJGZwEearxLtsjzPpI0uD2qGnCAOBBpkPveRSa4jvmO9e8dFXThKJ/N+JXyoMxIkWbIHg2AfYF9MejEn8lYPNM9UJnXU6q8YJOzn5JuSo8829tF/5VxtOQWt6uBw7APvcfILcejvZ/ZfiHauORnIC7vMx+6vNdpMzbb2jyLf5KS9i6F08uDpDf2ifF7lNR/YPKX6kd6TdKcNgWNdiHxnMMa0FznREkAbhIkm1xxCm6O9IMPjaXXYd+ZslrgQWua4atc03B0PMEEWXjnpwe52L39hgDR3gO95K76BK72Y2tSPq1KGd3AupvaAfAPcPEK6dkHGix9N2z+qxFDFNmKtOpQdG5+Q5T3lpP/Lar/wBE4z5qpgnqqdxcfOdowf2Qu+namDs1rjqyvTI8WvafY4p3obZGHP6qh/I5K16kOncGbjG7RZSdTa6ZqOytgd1zyuPNCdK6GfBYlv8A7LyO9rS4e0BVvS93z2D/AFh/npK528P7NX/U1P5HI3doWqpnzQATcc+e5e8+itsbMpT/AJmI9uKrL57p0LHQ67vzfuX0H6KGxsyiPz8R/wBVWSQWx+R+ktsb0lw1J7qdR5a5pAd2XECQCLgcCFa0arXtDmkOaRIIMgg7wV5d0xn5XXiLub/pMWr9HWYYUtcZDajg3kCGujzJPiipvKgSglFNGb23hvk+LLRZjiHAcA/lwBnyW16OYZoYagAl2h1sPvnyWa6fYPPiKZv/AHcHwc723Wq6NU8uFoj8weZuUIf00Ge4phGO2jTpRnNzoBc96mw2IbUbmaZH4sVh9v4ua9Sdxy+QVl0LxJLqjd0B3jMfjuRXJ6qFfH6bA+l+zw2rnGlQSf0m2Pw9qM6C4eOtfza0eEk+8eSd0+MUqZ4ON9LZSTJ4WQ/o3xQeyuAZLagB/cBsd+qVL9g1/rNFi9sUqdalQcfnKubIP0ReUzpFTzYepGoAI7wQVj+ljw3bmzSTE06jBY6l7SBbT1Stl0g/w1Xd2CqPpk12jzzHY80gDUc1oNruHCfcD5IN+OvM+SoumtSaDmEy505RBOggnTmPNHUgKjQ5jgQQD58RqPFcck2rO2NXQTUxYO9AV8a3NlzDMdBv0J07gT4KT5IVS7Sr0aeJpvcf7sPD3AExmYYExe8IKFjuaSLE9ZxTfVE1HxJi5gfiAfJT5ya76GWPmi8OB7WjeOhlx8gqfHvz7OIqHM95qtbM3LXvaDpaLKkYE58nwX7aAjVJTYRwexrm3aQIKSv44nL5pGV2ZiKOZ7TTAI9U5SbmTpHZvxWh2YB8hDvolj+MXc4aLzZu2KlnWBad03kEX4qZ23qzm5ZhohwALgLEEWmIlGXGmOuSjU4HEUBWqsdTGUOBachNs3aGXLI7MK56HVcuHFrF9Qnvzleat2tUL9buzSRM9oEHxurTZ/TPEUmBjW0yBJktcTck3h3el8Ww+XR6RXfnY+TbI7TkDvXnrazntrAWyxlI19Z8zIO4DzKio9MMRTpmjDHAZmy4OLocTN827Nw4KvwOMOepMAPYHE6aG0fvOQcKVmU7Yxxc3Vx4Wy6X/N5L6T9Gr52ZhTM9gjye4fBfN1aoDBlru8i0TungV7T6EekTKmHfgy4CpTe57BmBzU3nMY/RcXTyITxJz6KDpps+pgdpYnG1mf2XEZBTqA5jn6tuZjmCXC1N5mIgC8mF6D6M9uUsVg81J09W9zHWIg2fo4A6OCofT3TnAU7gfPjXnSqj4rAeifpIzZ+Jc2pVaMPXyMeZEMe3NlqG9m7j3g/RRpJ2C240bX0xdEsRXczEYdrqkNy1GMu+xlrg2CXToY4DwL9EPRGthRUxGJBbUqDJTY6MzWTmcXQLFxDba9m+q9IaZEi4OiZiK7abXPe4NY0FznOIAaAJJJOghGgZOqPNvTzif7HSpA3fWD4/NY0j3vaj/RHTjD636qhPD1Dp5rzX0jdKKeNrdYx4yDs0hNy0O9aOLjfugHRa30CY59QYtjnSGdSG8gesEeTQlW3Y71GjX9NKBdXwRB0qGf36P2K96QH+y4j9TU/03Kl6XuivhOGdxPg+j9quOkX+ExH6mr/puRrsRvSPl2jiBG/yP1T9y+hfRS+dl0DxdXP/AMmqvnGhGkx/+V9GeiT/AIVQ/TxH/VVkF2PPoH2psWpXxNZzGAgPDS4uAAPVUzETOhG5anYmzRh6QpjWS5xG8n8AeC5ssfOYn9cP9CipNqbQbQYXu1+i3e48B9qaktiNt6Ml0vxv9oyj6DQD3ntfELR9FsUKmGYd4lp5ZSY9kHxWCry9xe6cziSe8q96JbQ6p5pusx+h4O0v3i3gEi/qx3/NHOmGxa3W9dRaXtdGYNEkOAjQXIIj2q16HbJqUWOfVEPfHZ+q0aTzJJPktEo8RXaxpe9wa1okkmAB3o4JOxXNtYmO9JOLa1lNrtIe5wFyQQGgRvmXeSqfQfWDqGJAjs1g2037Adv/AEo8F556TunAxNXLSmLajtC1mxugEzzJ4LZ//wA6/wCFxU69eOf/AJTUUt2Fv04lh04oZtubKdPqh8a73chGk6kLWdPsQ6ns7F1GmHNovcDANwOBsVmemQJ21s0DcC42+iHga97mrQekr/hWN/UVPcj8ifB82Y/H1K7s1R0kgCwDbDkAI1RGyNo1MM1wpP8AWhxkB5MTEZgeJsOKqMz4DiIa4EAlrgJGoDtHGZtuupB1s5YOdt4yPzREmW6gXF+7ihiPl7mgb0txP+YP+Wz/AGqmrnrPXcdRMGLndbXUIcPdZ+UZJgmHZQYmA/Sd8c04CrPVlpzHtAZHBxmT6upEA35HgtivY2T9y9/LlWc2eTkFL1R6rcvZ04tF+Wt0FicYXCCTETaR48lWvrvguy2sHWdAJ57jyKRdUgiD27s7DpIn6I+kI3hDALmTMwoAjNU8HuSTWYx0aC1jrutwskjsGiU0ZpzkAlzZvrE8l1lOWPIYBDSNZtLbWHNEtxJNISQDmAjutc8U3B1vm35iG20mdcnHdaEoxHhKcugUxLc183Ik7lDhqYJDcgk39bl3cijdn1A1zzMTm1i/Zfoo9nPHWNJcAbXtHqx9q3yb4BnxncCwEueRrzjhzU9GgetcMoBFFm/Qdnu/AUT3A1AbWeT/ABDVGtrjrqpzT81TFv2Z08UGFFZVgD1AdeI9xR2zhUYS9nYe1wIc0ua5ph5BaQQQb+1B1221HiQrDCVBkeST6w8gHDci1oC7CcT0kxmLpmjXrPqtYAYfe8ZZnWYJEniq1hmk4hoADhIvuDjxTcEcucn6QEEd4TmEdU5pOruUeq7XxWaMjUdH+muPwmHaKFQdUCQ1lRvWNaAGgBsmWi+gMclXdJummNx3zVepmZr1bQabCQJu1p7XEZpiyBaR1AaTHaOn7Gh0Qc9uSQNd4kdkj3wijMLqUn9S3sgjgZ3u7+9M2VtzF4M1Pk1V9LORnyZTOWcsgjdJ0RTqw6ljZO7jrnM8uCrnuEnvCETSLDEdMsbULTVxVVzm/wB2ZAykkH6IE3DdZ0ReI6fbQewtdiapa4ZXA5IIdIIMN0hZnHsuy30goX5RUiN4t5KggSxxE9mfOPVWj2X0vx1BgpUqz6dNucgCIEvc5xuN5LjrvWbcBmj8blPhmtzG2n+6ErQyPVeiHTOocOXVcWBUNR+cvLQXGYbqPqBotwCNxXSGm5wLqvWZrBwOcb7SNNCvL8Dh3dQXMAgVnSJAd6lK8TcdoaaLTbFoF9IDNld1gvGnrEfDzSTlRSHGmzYYHGiqzNlIuReJt3KfuPuQDa7GgduQC4GB+aHEkzf1TaN67tVjn4d/VuAJaC1xMDUGZHJND1RsnNYyovsPtuuwBrXkjQBwDgOF9QFiOmW3cXUqgOe4tOHzBrXGnTzEQ49ixcOZMbolah+Q+sTYyMuswdAL6wqHpFTzFoYGNLQ5waS2CCQ0uMtiwzWmDfxWT3Q8I6s8srbNhwzaSQY01vLjbir3YnSDEYVrqeGxApsc6mXZXTEvDZEtI0t4IHbd6zc1XrDmMBvaHrCI0aPDig6T+3LQcoNOxcJd2yY5nkqLaJyVMu6vSrFPezEVK4qVaNPsPzHMPnGZs1oBkbk7G9N8dWoVGVcVmZVp1Gua42icvZLW6nnxVFs8H5+LgGBaYJzOy3HL2IDE4luSm3N2vnBU1+k4EA2+1FLYpbYh3ZdTOXKzr3NN5J7RgyII7uCY7acE18tOS5zC0SGxkYZi3BRvqS6s8Me9hBytEkfO2kADS/tTcds54psDKVQy7M6xcQcoaBYWFidOC1BCcNWbIw5yZTldmB7UnDNsOU8kzB49z/n8tMGmWNIOaINOsMz9bS4CUXjNkvpPo1abOszMaSyDLIphnazAdrW2ttyBxfR7FU+zTh4cBJDgIgmxBdHvQozIxtFoEZNS0m8CWuzCOWg42VpsBrK7X9ZY02NFEN0hocTmMzoNZCAb0dxJv1YHe5vwKs9k9H6rT2yGibgS7MCxzSDHDNKr6UhdlZV2xSpuLOrdYnSCJJk3niV1Q1eieJkwWDkC6B/CkkyX0bf2JhmiHWHb08PNcwjs1KoSA2BEcbt4qZ1AtosbIy5zed8DlzXMPhjTpVIggxMnTTlyUrKjcA8uc8EAQH34w1/48VFs95NRrYta/kisNhSzO4Q7M18ieLXTu5qPZuF7TKgIns2nu5LWtm3oGL4fAAPaN773QjKFMdZVFv7tvl2IQlPDZzmkdl3HXtTwRtLNnrGBZjRr+gOHJZmQFiHRAsbcPNG4Vo6txm88BwcoqmCLg0303f0KIo0nik62/SeIcs2qMkwTCic14iAOYkSusfNPMTcHTua4j4qTD4d7WudAOaDr+cLac0/5A5rMkDtOiZ/Ndy71m0amOABotJNySTys1BVD2iO+8D6qsnYd7aTGwIDjF9fV5IStgSHEwSe47xHDmtFozTCajPm2wfd9cgoOpT1uNRqjsU17WMGUTA38Hnl3ququffsjdvRiZgmOaQWD87j3eSHc7txeZ4zvUuKcTltEO+xQVWkOJ5+SdE2GGpePxuUlKoSbE+cb1XvqGZT6LzNtUaNZY0sUWSJI1tMg5g0EHyCtcFtIB4kcIIMZY0MjcCs3XMmZHHWdAisC4vLWgXL4nURIAtv3+SVwseM2jdN2kXPD3CGuBGU8QHTPE3hFVukBFFwYYho0BI0sqLD4FznUwbZgSC6TBl89mQZkAbuO5R0aLHtc1ziSKAdlbLYgkSSHXngVFRoo52aqj0hyg9kve5sMzNloMGSRImyo+ke0Di8QJOXN9GnUIgMuBcRqqzaOPpUm0nVGuc7WA43FhcE74PCJRO0KNKMPWp02jOC4CIkZQQHR9qMY4iubl2SYnZrIzOp5iDmBNQzNvqxvhSM2ayQ4UqU6gmXGfEqHa76DaMVWhhdDux2SACCL31A04FQ7G2lgqmWmQA+AAXSMx7zoeSa3QmrB8dTpMFTLUDTaQ3KBJJBHMjirnZlB5psILRLQdGg3HdK5tbo/QNNz+rAdE2J+tCrdkNo5AKnWE9qCDuBgalLehmi+OHq/W9oTfk1X6x/eKHwuApVJyOqiNdwvpchSP2MG366oO9wA+CFgoccLV+sf33JpwtXif3nH4KMbMP0cSfPN7nLp2XX/APUH92PeStZqF8iqcPaf9qacA/6g/H7Ka7B4oaVZ7zH/AGLnybGD6bT7feAtaNQjs3jSE97h7mri4WYzj/L/ALklg0ZR9ZuQMz2EndrEfALtCo3L1bX6914k/aiDsvknfkzkujxSJ5oEo4lrc2Wp60zpbMIslRexjw4PBgNiY1AB96M/JnJL8mDgj4pGzQC0MkHPoSd30tUfhMjjUIqNktEyQNCCI8lGNnDgoqmCjclfHIymGU+rBk12yQBHmpmuYKJDazSRxIk2jx1KpzRISFIwkwY+QRSxIDT27mDEt3EWHkujHNyRmPrTqJ0I+PFDNwpO73KT5EY0CbB/AuQe3EB1Jo6wANO8jNeJMeASDaeUtFdt3TrG+Y8rKvfh4GgUXVpcWNkW22q8UuzVacvZga2JOneSsyaxJJLte5W3yckaSiMPsoO1CeEH0JKRRZJ1cfZ9q71ImZP8P2rWUdht3geU/BD4jZTRPuAHv8FV8bQtoznUt4n+Fd6tvE+bVYfIQQ4j6MeMkBKhhhOk+anY1AeCyBxJJJymAY3xe+oifNH4VtNrmFtS4LdwEQ4G8FbPYmDpuYA6mwjW7ZuOF7Kyq7Ew72kdVTvvDQD4EaFU8TfuLnRmaeIqOdQLQ1xBLrGJBbVN+CrMJiCypVeWuINFrLDSwN+Sscf0fqUnl9B2W0XLjuI7tD7VTYTauRlRr4MgNkTuGW5Jvu9qjKDj2UUkyu6QVC6oOAY0b/qj7Vq2kOo4JuYeoBrxazcqQ1qRvnbJA3jc0BXeLwYpuolpN57twEJX7Gj7mT6R441azidJMfjyHgqwC0qwqYMuOadZOnEk/FRnBnSfYqLomb3ZGML8AwvJLshBJ35ajmiTxgBA7Jw2fK3i4zbdLyRO7d5Luy8UyngWsdM5Xx2SReo46p2ycTlw76wNySxu65cST3gCVH5LPpBO1ttU8O3q6UNDbSLmd4bxPEn7xjsV0hqOJLbcz2neZQO0MUXunduHAfehWp1FE2yxbtqvP95PeBHuVhgullZhuA4cuz7Lj2KgqGLBMRpAtnp2x+klKvDZyv8Aqm3lx8PYitqYeplzUqjmkXImQRwMzHfu7tPKs0aa6rZdFulBMUa5vox5/ld9qRwraGUr7LFuMq7sQ0cn5WuB3giOKSOrbNYTMDd9Fp3cSF1LaGpgccvBcI9qa6px9qTan4/oF6SOZkrG8vx4J4pcAoRU8vBPbXB0+HkmAMr0fxdV+IbBj7+5WNSqI3geHHihKl/6pWgple5p5fjxSDDwHPT7UQ+iLk/jzUlOmP6KdDWKhQ4gKf5Py+Pt3Keg3l8T7lO4A6z5/cjRiqqUTE24ePghX0jNoVliWZryMvh8Ch3M5+74rYmsZQYZ3ez2K0wrb/Rjvv7o9qApgA3Vphr3iO4femSBYYxns3ZvuQ+NpAi0jXWAfCeClcQAbe0j3FA4mpF4ETvJ84tvWYUU2Mp9o5XgWFuBAv7ZSw0i2fxjgliyZJiO4xPHeU7CcW6/vEk6KMY0M2afBYhjQMwM8ux8VaU8RIsy3HNM+aocHjSAM4LucGRyJVth8YDHZ17gT4Eq6EZNXrBwuzdxJ8ICye1tnU3SGi/6Lh7CtkKoIkB084vyEqu2iJb6t+BMHxieazimqYLo82xVHIYIseSKxG3nF1PNJDOAjh9iudpbOBMggW3AeUghUeNoQbbuS5p8dFIztEbNo0w0CHWA3cgoqm0KfA+SEqvITGuJ0ShNvVwTThg8TJpsI03tbyVZjqhbhMoOr3fxBgHvcpnbfp/JxTvIptb4tgfCUBVrB1JoG+p/2k/BSSHmyldhzxTepKtHUhxULqaqTK80uab1aOc0KJzVjApauEKctTC1Yxe4TpZWYxrCGvyiMzpkjdPhbwSVDCSXFBtmxdie/n581KK54mLWSSXYiViZi2m3vCmZXB5+e5JJMgWdc4m9+7T4qF0c+Jukks0ZMZTf+OHwUjKsRc+KSSQYno1o1+PObKc1bXM2+8+KSSKRrBTiYgXvz036IcvH48kkkaA2PpOOg8fxvRjK8b5758xC4kmSAGddA0/HJB4uuHz2Z4EnjO7ikkgwlFisQ5pLZiN3G/jGiHpVzNtfdOnBJJQfYxeYOu5rWueSZ0HjAi/Ler6k+QDl0+jE8/rQupLogtCNktQtAiwLtxG8cxNvtQskkwJF7SBMDu5JJJwFfj2Oi8C02ufaqLF0BEnQ7z92iSSlMKKrEtF+WtygW1fLckkuWRRCfWsVyni3CBqAZjnEfFJJKMI4t/1vcnDGPhJJYBEa7uKQrFJJYw3rTxSNQpJLGOZykkksY//Z");
//        newProduct.setPriceProduct(9999);
//        newProduct.setTypeProductId(1); // Example type ID
//        newProduct.setSizeId(2); // Example size ID
//        newProduct.setTrademarkId(3); // Example trademark ID
//        newProduct.setQuantity(10);
//        newProduct.setDateAdded(new java.util.Date()); // Current date
//        newProduct.setDescribe_product("Description of the new product");
//
//        // Add the product
//        adProduct.addProduct(newProduct);

        adProduct.getProductById(22);

        
        Product product = new Product();
        product.setProductId(17); // Set the ID of the product you want to update
        product.setProductName("New Product Name");
        product.setImgProduct("new_image_url.jpg");
        product.setPriceProduct(8888);
        product.setTypeProductId(2);
        product.setSizeId(3);
        product.setTrademarkId(2);
        product.setQuantity(100);
        product.setDateAdded(new Date());
        product.setDescribe_product("Updated product description");

        // Assuming you have a method to get the database connection
        adminProduct pshop = new adminProduct();
        pshop.updateProduct(product);
    }
}
