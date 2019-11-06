package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.gymAPI.model.ItemFicha;

public interface IItemFichaService {

	Optional<ItemFicha> getItemFichaById(Integer id);

	List<ItemFicha> getAllItensFicha();

	void deleteAllItensFicha();

	void deleteItemFichaById(Integer id);

	void updateItemFichaById(Integer id, ItemFicha itemFicha);

	void updateItemFicha(ItemFicha itemFicha);

	void insertItemFicha(ItemFicha itemFicha);

}
