package com.jad.simFactory.data;

import com.jad.simFactory.structure.Product;

class Products extends FactoryData<Product> {
    private static int NbProducts = 10;

    @Override
    protected void generateDataSet() {
        for (int i = 0; i < Products.NbProducts; i++) {
            Product product = new Product(String.format("%05d",i));
            this.addData(product);
        }
    }
}
