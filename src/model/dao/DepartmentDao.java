package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);// -> opera��o respnsav�l por inserir o objeto "obj" no banco de dados.
	void update(Department obj);// -> atualizado as informa��es.
	void deleteById(Integer id);// -> deletando o id.
	Department findById(Integer id);// -> opera��o responsav�l por pegar o "id" e consultar no banco de dados, se existir retorna o id se n�o retona null.
	List<Department> findAll();// -> findAll para retornar todos os departamentos como lista.
 	
	
}
