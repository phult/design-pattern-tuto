/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.structural.facade;

/**
 *
 * @author phuluong
 */
public class ComputerFacade {

    static long BOOT_ADDRESS = 0;
    static long BOOT_SECTOR = 0;
    static int SECTOR_SIZE = 0;

    private CPU processor;
    private RAM ram;
    private HDD hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new RAM();
        this.hd = new HDD();
    }

    public void start() {
        System.out.println("Computer's starting");
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();        
    }
}
