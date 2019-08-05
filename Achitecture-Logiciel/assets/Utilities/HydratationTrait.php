<?php

/**
 * 
 * @author med - electron - rango cheikh
 * @since 08/07/19
 * @version 1.0
 * 
 * Ici on a défini un traitement contenant  une methode permettant l'hydration de n'importe quel objet 
 *
 */

trait HydratationTrait 
{
    private function hydrate(Array $data)
    {
        foreach($data as $key => $value)
        {
            $method = 'set'.ucfirst($key);

            if(method_exists($this, $method))
            {
                $this->$method($value);
            }
        }
    }
}