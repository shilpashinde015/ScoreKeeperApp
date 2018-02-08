package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the increment quantity  button is clicked.
     *
     */
    public void increment(View view) {
            quantity = quantity + 1;
            display(quantity);

    }
    /**
     * This method is called when the decrement quantity button is clicked.
     *
     */
    public void decrement(View view) {
        if(quantity!= 0) {
            quantity = quantity - 1;
        }
            display(quantity);

    }
    /** This method is called when order button is clicked**/

    public void submitOrder(View view){

      String priceMessage = "Total $" +(quantity * 5);
      priceMessage = priceMessage + "\nThank You!";
      displayMessage(priceMessage);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }
    private void displayPrice(int quantity){
        TextView quantityTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView.setText(NumberFormat.getCurrencyInstance().format(quantity));
    }
    private void displayMessage(String message)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}