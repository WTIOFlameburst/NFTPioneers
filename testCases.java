package com.company;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class testCases {


    @Test
    public void test_setNFT() {
        ListOfNFTS nftList = new ListOfNFTS();
        nft n = new nft("Pirate Kitten", "Crypto Kitten", "piratekitten.jpg", "Common", 100);
        nft n2 = new nft("Gangster Monkey", "Space Monkeys", "gangstermonkey.jpg", "Legendary", 500);
        nft n3 = new nft("General Kitten", "Crypto Kitten", "generalkitten.jpg", "Epic", 250);
        nftList.addNFT(n);
        nftList.addNFT(n2);
        nftList.addNFT(n3);
        assertEquals("Pirate Kitten", n.getName());
        assertEquals("Crypto Kitten", n.getCategory());
        assertEquals("piratekitten.jpg", n.getImageName());
        assertEquals("Common", n.getRarity());
        assertEquals(100, n.getPriceOfNFT());
    }

    @Test
    public void test_sortCategory() {
        ListOfNFTS nftList = new ListOfNFTS();
        ArrayList listOfNFTS = new ArrayList();
        nft n = new nft("Pirate Kitten", "Crypto Kitten", "piratekitten.jpg", "Common", 100);
        nft n2 = new nft("Gangster Monkey", "Space Monkeys", "gangstermonkey.jpg", "Legendary", 500);
        nft n3 = new nft("General Kitten", "Crypto Kitten", "generalkitten.jpg", "Epic", 250);
        listOfNFTS.add(n);
        listOfNFTS.add(n2);
        listOfNFTS.add(n3);
        nftList.sortNFT(listOfNFTS, 7);
        assertEquals(n, listOfNFTS.get(0));
        assertEquals(n3, listOfNFTS.get(1));
        assertEquals(n2, listOfNFTS.get(2));
    }


    @Test
    public void test_sortCategoryDescending() {
        ListOfNFTS nftList = new ListOfNFTS();
        ArrayList listOfNFTS = new ArrayList();
        nft n = new nft("Pirate Kitten", "Crypto Kitten", "piratekitten.jpg", "Common", 100);
        nft n2 = new nft("Gangster Monkey", "Space Monkeys", "gangstermonkey.jpg", "Legendary", 500);
        nft n3 = new nft("General Kitten", "Crypto Kitten", "generalkitten.jpg", "Epic", 250);
        listOfNFTS.add(n);
        listOfNFTS.add(n2);
        listOfNFTS.add(n3);
        nftList.sortNFT(listOfNFTS, 8);
        assertEquals(n2, listOfNFTS.get(0));
        assertEquals(n, listOfNFTS.get(1));
        assertEquals(n3, listOfNFTS.get(2));
    }

    @Test
    public void test_sortName() {
        ListOfNFTS nftList = new ListOfNFTS();
        ArrayList listOfNFTS = new ArrayList();
        nft n = new nft("Pirate Kitten", "Crypto Kitten", "piratekitten.jpg", "Common", 100);
        nft n2 = new nft("Gangster Monkey", "Space Monkeys", "gangstermonkey.jpg", "Legendary", 500);
        nft n3 = new nft("General Kitten", "Crypto Kitten", "generalkitten.jpg", "Epic", 250);
        listOfNFTS.add(n);
        listOfNFTS.add(n2);
        listOfNFTS.add(n3);
        nftList.sortNFT(listOfNFTS, 1);
        assertEquals(n2, listOfNFTS.get(0));
        assertEquals(n3, listOfNFTS.get(1));
        assertEquals(n, listOfNFTS.get(2));
    }


    @Test
    public void test_sortNameDescending() {
        ListOfNFTS nftList = new ListOfNFTS();
        ArrayList listOfNFTS = new ArrayList();
        nft n = new nft("Pirate Kitten", "Crypto Kitten", "piratekitten.jpg", "Common", 100);
        nft n2 = new nft("Gangster Monkey", "Space Monkeys", "gangstermonkey.jpg", "Legendary", 500);
        nft n3 = new nft("General Kitten", "Crypto Kitten", "generalkitten.jpg", "Epic", 250);
        listOfNFTS.add(n);
        listOfNFTS.add(n2);
        listOfNFTS.add(n3);
        nftList.sortNFT(listOfNFTS, 2);
        assertEquals(n, listOfNFTS.get(0));
        assertEquals(n3, listOfNFTS.get(1));
        assertEquals(n2, listOfNFTS.get(2));
    }

    @Test
    public void test_sortRarity() {
        ListOfNFTS nftList = new ListOfNFTS();
        ArrayList listOfNFTS = new ArrayList();
        nft n = new nft("Pirate Kitten", "Crypto Kitten", "piratekitten.jpg", "Common", 100);
        nft n2 = new nft("Gangster Monkey", "Space Monkeys", "gangstermonkey.jpg", "Legendary", 500);
        nft n3 = new nft("General Kitten", "Crypto Kitten", "generalkitten.jpg", "Epic", 250);
        listOfNFTS.add(n);
        listOfNFTS.add(n2);
        listOfNFTS.add(n3);
        nftList.sortNFT(listOfNFTS, 5);
        assertEquals(n, listOfNFTS.get(0));
        assertEquals(n3, listOfNFTS.get(1));
        assertEquals(n2, listOfNFTS.get(2));
    }

    @Test
    public void test_sortRarityDescending() {
        ListOfNFTS nftList = new ListOfNFTS();
        ArrayList listOfNFTS = new ArrayList();
        nft n = new nft("Pirate Kitten", "Crypto Kitten", "piratekitten.jpg", "Common", 100);
        nft n2 = new nft("Gangster Monkey", "Space Monkeys", "gangstermonkey.jpg", "Legendary", 500);
        nft n3 = new nft("General Kitten", "Crypto Kitten", "generalkitten.jpg", "Epic", 250);
        listOfNFTS.add(n);
        listOfNFTS.add(n2);
        listOfNFTS.add(n3);
        nftList.sortNFT(listOfNFTS, 6);
        assertEquals(n2, listOfNFTS.get(0));
        assertEquals(n3, listOfNFTS.get(1));
        assertEquals(n, listOfNFTS.get(2));
    }

}

