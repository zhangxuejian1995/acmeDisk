package cn.bdqn.controller;

import cn.bdqn.entity.Commodity;
import cn.bdqn.service.FloorService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**index,jsp页面中的楼
 * Created by Administrator on 2018/3/20.
 */
@Controller
public class FlootController {
    @Resource
    FloorService floorService;
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public  String floot( int typeparentId,int pageNum ,int pageSize,Model model){
            PageInfo<Commodity> pageInfo =floorService.queryList(typeparentId,pageNum,pageSize);
          List<Commodity>  list= pageInfo.getList();
          model.addAttribute("list",list);
        for (Commodity commodity : list) {
            System.out.println(commodity + "------------------------------------------------");
        }
        return "index";


    }
}
