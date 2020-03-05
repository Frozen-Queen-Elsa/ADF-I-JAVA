/*
- Field VAT_TAX_PERCENT = 0.1 f
- Method: public float getCost(): returns the cost of a product after TAX.
 */
package Goods;


public interface ITax {
    public static final float VAT_TAX_PERCENT = 0.1f;
    public float getCost();
}
