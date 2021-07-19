package com.rich.service.impl;

import com.rich.entity.Fruit;
import com.rich.mapper.FruitMapper;
import com.rich.service.FruitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rich.utils.DataUtil;
import com.rich.vo.BarVO;
import com.rich.vo.DataVO;
import com.rich.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Rich
 * @since 2021-07-19
 */
@Service
public class FruitServiceImpl extends ServiceImpl<FruitMapper, Fruit> implements FruitService {

	@Autowired
	private FruitMapper fruitMapper;

	@Override
	public BarVO barVOList() {
		BarVO barVO = new BarVO();
		List<String> names = new ArrayList<>();
		List<DataVO> values = new ArrayList<>();

		//先查出数据
		List<Fruit> fruits = this.fruitMapper.selectList(null);
		for (Fruit fruit : fruits) {
			names.add(fruit.getName());
			DataVO dataVO = new DataVO();
			dataVO.setValue(fruit.getSale());


			dataVO.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
			values.add(dataVO);
		}

		// 再转换VO
		barVO.setNames(names);
		barVO.setValues(values);

		return barVO;
	}

	@Override
	public List<PieVO> pieVOList() {
		List<PieVO> pieVOList = new ArrayList<>();
		List<Fruit> fruits = this.fruitMapper.selectList(null);
		for (Fruit fruit : fruits) {
			PieVO pieVO = new PieVO();
			pieVO.setValue(fruit.getSale());
			pieVO.setName(fruit.getName());
			pieVO.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
			pieVOList.add(pieVO);
		}

		return pieVOList;
	}
}
