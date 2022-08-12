package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);// -> operação respnsavél por inserir o objeto "obj" no banco de dados.
	void update(Department obj);// -> atualizado as informações.
	void deleteById(Integer id);// -> deletando o id.
	Department findById(Integer id);// -> operação responsavél por pegar o "id" e consultar no banco de dados, se existir retorna o id se não retona null.
	List<Department> findAll();// -> findAll para retornar todos os departamentos como lista.
 	
	
}
