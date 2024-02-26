package znth.team.learning.skiplist;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author: ddc
 * @date: 2024-02-24:14:38
 */
public class MySkipList {

  public static void main(String[] args) {
    ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
    map.put("1", "1");
    ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<>();

    // 对比插入速度
    // 对比查询速度
    // 对比删除速度
    // 对比上面全部的并发性能


    // 对比内存占用


  }


}
