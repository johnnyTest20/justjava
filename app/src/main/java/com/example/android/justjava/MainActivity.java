/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:

 */
package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity =2;

    private static final String Tag ="Log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        Log.d(Tag,"error happend in this Method");
        int price = quantity*5;

        String priceMessage = "Total = $" + price + "\nThank you ";
        displayMessage(priceMessage);
        //displayPrice(quantity*5);
        //"Total\n" + " " + displayPrice(quantity*5) + "Thank you"
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number){
        TextView priceTextview = (TextView) findViewById(R.id.price_text_view);
        priceTextview.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**

     * This method increses when user presses the + button
     */
    public void increment(View view) {
        Log.d(Tag,"error happend in this Method");

        quantity+=1;
        display(quantity);

    }
    /**

     * This method increses when user presses the - button
     */
    public void decrement(View view) {
        Log.d(Tag,"error happend in this Method");

        quantity-=1;
        display(quantity);

    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}