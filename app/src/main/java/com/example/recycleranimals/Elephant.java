package com.example.recycleranimals;

public class Elephant extends GeneralAnimals {
    private String voice;
    private String name;
    private int img;

    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }

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

    @Override
    String voice() {
        setVoice("FFFFFFFFFFFfffffff");
        return voice;
    }

    @Override
    String name() {
        setName("elephant");
        return name;
    }

    @Override
    int img() {
        setImg(R.drawable.ic_launcher_account);
        return img;
    }
}
