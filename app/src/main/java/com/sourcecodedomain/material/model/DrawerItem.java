package com.sourcecodedomain.material.model;

/**
 * Class of menu drawer itens
 * @author <a href="mailto:gmendes92@gmail.com">Guilherme Mendes</a>
 */
public class DrawerItem {

    private int icon;
    private String title;

    public DrawerItem(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public DrawerItem() {
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
