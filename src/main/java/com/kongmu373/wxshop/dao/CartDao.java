package com.kongmu373.wxshop.dao;

import com.kongmu373.wxshop.entity.ShopCartData;
import com.kongmu373.wxshop.generated.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDao {
    private final ShoppingCartMapper shoppingCartMapper;

    @Autowired
    public CartDao(ShoppingCartMapper shoppingCartMapper) {
        this.shoppingCartMapper = shoppingCartMapper;
    }

    public int getCountShopsInShopCart(Long id) {
        return shoppingCartMapper.getCountShopsInShopCart(id);
    }

    public List<ShopCartData> getCartDataList(long userId, int pageNum, int pageSize) {
        return shoppingCartMapper.getCartDataList(userId, (pageNum - 1) * pageSize, pageSize);
    }
}