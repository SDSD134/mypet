package com.pet.mapper;

import com.pet.po.Trade;
import com.pet.po.TradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeMapper {
    int countByExample(TradeExample example);

    int deleteByExample(TradeExample example);

    int deleteByPrimaryKey(String tradeId);

    int insert(Trade record);

    int insertSelective(Trade record);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(String tradeId);

    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByExample(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}