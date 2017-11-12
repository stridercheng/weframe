package cn.com.xhengz.weframe.entity;

import javax.persistence.Table;

/**
 * Created by xhengz on 2017/11/8.
 */
@Table(name="menu")
public class Menu {

    private String menuId;
    private String menuName;
    private String menuType;
    private String menuLink;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuLink() {
        return menuLink;
    }

    public void setMenuLink(String menuLink) {
        this.menuLink = menuLink;
    }
}
