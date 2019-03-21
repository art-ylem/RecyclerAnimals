package com.example.recycleranimals;

public class Butterfly extends GeneralAnimals{
    private String voice;
    private String name;

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

    private int img;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    @Override
    String voice() {
        setVoice("But-But-But");
        return voice;
    }

    @Override
    String name() {
        setName("butterfly");
        return name;
    }

    @Override
    int img() {
        setImg(R.drawable.ic_launcher_account);
        return img;
    }
}
