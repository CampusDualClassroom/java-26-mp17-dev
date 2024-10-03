package com.campusdual.classroom;

import java.text.Normalizer;

public class Contact implements ICallActions {
    private String name;
    private String surnames;
    private String phone;
    private String code;

    public Contact(String name, String surnames, String phone) {
        this.name = name;
        this.surnames = surnames;
        this.phone = phone;
        this.code = getCode();
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getPhone() {
        return phone;
    }

    public String getCode() {
        String[] strArray = surnames.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name.toLowerCase().charAt(0));
        if (strArray.length == 1) {
            stringBuilder.append(this.surnames.toLowerCase());
        } else {
            for (int i = 0; i < strArray.length; i++) {
                if (i == 0) {
                    stringBuilder.append(strArray[i].toLowerCase().charAt(0));
                } else {
                    stringBuilder.append(strArray[i].toLowerCase());
                }
            }
        }
        return clean(stringBuilder.toString());
    }

    public String clean(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("\\p{InCombiningDiacriticalMarks}", "");
        return s;
    }

    @Override
    public void callMyNumber() {
        System.out.println("Llamándome a mí mismo " + this.name + " " + this.surnames + " " + this.phone);
    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println("Llamando al número "  + this.name + " " + this.surnames + " " + number);
    }

    @Override
    public void showContactDetails() {
        System.out.println(this.name + this.surnames + this.phone + this.code);
    }
}
