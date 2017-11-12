package cn.com.xhengz.weframe.dao;

import cn.com.xhengz.weframe.common.persistence.IBaseDAO;
import cn.com.xhengz.weframe.dto.MenuDTO;
import cn.com.xhengz.weframe.entity.Menu;

import java.util.List;

/**
 * Created by xhengz on 2017/11/8.
 */
public interface MenuDAO extends IBaseDAO<Menu> {

    List<MenuDTO> selectMenuDTO();
}
