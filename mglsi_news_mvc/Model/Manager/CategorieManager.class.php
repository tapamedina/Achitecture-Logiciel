<?php

/**
 * 
 * @author med - electron - rango cheikh
 * @since 08/07/19
 * @version 1.0
 *   
 */
class CategorieManager 
{

    private $db;

    public function __construct($db)
    {
        $this->setDb($db);
    }

    public function getDb($db)
    {
        return $this->db;
    }

    private function setDb($db)
    {
        $this->db = $db;
    }

    public function getAll()
    {
        $categories = array();

        $request = $this->db->query('SELECT * FROM Categorie');
        $data = $request->fetchAll(PDO::FETCH_OBJ);
        return $data;
    }

    public function get($id)
    {
        $id = (int) $id;

        $request = $this->db->query('SELECT * FROM Categorie WHERE id = '.$id);
        $data = $request->fetch(PDO::FETCH_OBJ);

        return new Categorie($data);
    }

    public function reediter($titre,$contenu,$categorie){
        $request = $this->db->prepare('Update * Categorie set  titre =:titre, contenu =:contenu ,categorie=:categorie where id = '.$id);
        $request->execute(array(
            'titre' => $titre,
            'contenu' =>$contenu,
            'categorie' => $categorie
        ));
        return 1;
    }

}