import com.monster_03.MyService;
import com.monster_03.ServiceImpl003;
import com.monster_03.iml.ServiceImpl001;

module MyOneMoudule {
    exports com.monster_01;
    exports com.monster_02;
    exports com.monster_03;
    exports com.monster_03.iml;
    provides MyService with ServiceImpl003;
}