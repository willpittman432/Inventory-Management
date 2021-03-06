/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 *
 * @author wpittman
 */
public class Inventory {
    public static ObservableList<Product> products = FXCollections.observableArrayList();
    public static ObservableList<Part> allParts = FXCollections.observableArrayList();
    
    private static int productID;
    private static int partID;
    private static Part part;
    private static Product product;
    public static void addProduct(Product product) {
        products.add(product);
    }
    
    public static boolean removeProduct(int index) {
        Inventory.product = product;
        products.remove(index);
        
        return true;
    }
    
    public static void addPart(Part part) {
        allParts.add(part);
    }
    
    public static boolean deletePart(Part part) {
        Inventory.part = part;
        allParts.remove(part);
        return true;
    }
    
    public static ObservableList<Part> getAllParts() {
        return allParts;
    }
    
    public static ObservableList<Product> getAllProducts() {
        return products;
    }
    
    public static void updatePart(int partID) {
        Inventory.partID = partID;
        
    }
    
    public static void lookupPart(int partID) {
        
    }
    
    
}
