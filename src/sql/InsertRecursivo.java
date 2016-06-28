/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

/**
 *
 * @author ruben
 */
public class InsertRecursivo {

    public static void main(String[] args) {

        for (int i = 0; i < 5000; i++) {

            System.out.println("INSERT INTO `almacenp_tienda`.`ps_stock_available` (`id_stock_available`, `id_product`, `id_product_attribute`, `id_shop`, `id_shop_group`, `quantity`, `depends_on_stock`, `out_of_stock`) VALUES (NULL, '" + i + "', '0', '1', '0', '100', '0', '0');");

        }

    }

}
