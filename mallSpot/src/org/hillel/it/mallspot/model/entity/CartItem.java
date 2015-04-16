package org.hillel.it.mallspot.model.entity;



public class CartItem extends BaseEntity { 

  private Item item;
  private int quantity;
  private boolean inStock;
  private double total;

  public boolean isInStock() {
    return inStock;
  }

  public void setInStock(boolean inStock) {
    this.inStock = inStock;
  }

  public double getTotal() {
    return total;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
    calculateTotal();
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
    calculateTotal();
  }

  public void incrementQuantity() {
    quantity++;
    calculateTotal();
  }

  private void calculateTotal() {
    if (item != null && item.getListPrice() != (Double)null) {
      total = item.getListPrice()*item.getQuantity();
    } else {
      total = (Double) null;
    }
  }

}
