package com.udacity.store;

import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream;
import com.google.common.io.ByteStreams;
import com.udacity.store.model.Order;
import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;



@SpringBootApplication(exclude = BatchAutoConfiguration.class)
public class StoreApplication  implements CommandLineRunner {

    public static void main(String[] args) {
            SpringApplication.run(StoreApplication.class, args);
        }

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        // TODO: Populate the database with products
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource rs =  resourceLoader.getResource("classpath:static/iphone.png");
        byte[] img = Files.readAllBytes(rs.getFile().toPath());
        Product product =new Product(1L,1,"phone",544.4,"Example description",img);

        productRepository.save(product);
    }
}
