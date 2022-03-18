package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    private int balance = 1000;
    private int bank = 0;
    private int dayCounter = 1;
    ArrayList nftCollection = new ArrayList<nft>();
    public static void main(String[] args) {
    }

    public void buyNFT (nft nft){
        balance -= nft.getPriceOfNFT();
        nftCollection.add(nft);
    }

    public void sellNFT (nft nft){
        if (nftCollection.indexOf(nft) != -1){
            balance += nft.getPriceOfNFT();
            nftCollection.remove(nft);
        }
    }

    public void dayCounter (int dayCounter){
        dayCounter++;
    }

    public void newDay (){
        for (int i = 0; i != nftCollection.size(); i++){
            nft currentNFT = (nft) nftCollection.get(i);
            double currentPrice = currentNFT.getPriceOfNFT();
            String rarity = currentNFT.getRarity();
            currentNFT.changePrice(currentPrice, rarity);
            int newPrice = currentNFT.getPriceOfNFT();
            balance += newPrice;
        }
    }
}
