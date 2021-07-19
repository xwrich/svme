package com.rich.service;

import com.rich.entity.Fruit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rich.vo.BarVO;
import com.rich.vo.PieVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Rich
 * @since 2021-07-19
 */
public interface FruitService extends IService<Fruit> {

	//柱状图数据
	public BarVO barVOList();

	//饼状图
	public List<PieVO> pieVOList();
}
