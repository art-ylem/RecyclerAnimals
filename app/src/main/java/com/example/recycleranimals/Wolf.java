package com.example.recycleranimals;

public class Wolf extends GeneralAnimals implements Runable, Wuo{
    private String voice;
    private String name;
    private int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    @Override
    String voice() {
        setVoice("Woooo-Woooo");
        return voice;
    }

    @Override
    String name() {
        setName("wolf");
        return name;
    }

    @Override
    int img() {
        setImg(R.drawable.ic_launcher_account);
        return img;
    }

    @Override
    public void run() {

    }

    @Override
    public void wou() {

    }
}
