package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);// -> operação respnsavél por inserir o objeto "obj" no banco de dados.
	void update(Seller obj);// -> atualizado as informações.
	void deleteById(Integer id);// -> deletando o id.
	Seller findById(Integer id);// -> operação responsavél por pegar o "id" e consultar no banco de dados, se existir retorna o id se não retona null.
	List<Seller> findAll();// -> findAll para retornar todos os seller como lista.
	List<Seller> findByDeparment(Department department);
	
	
}
